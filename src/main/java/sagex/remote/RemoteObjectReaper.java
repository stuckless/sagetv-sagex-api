package sagex.remote;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import sagex.util.ILog;
import sagex.util.LogProvider;

public class RemoteObjectReaper {
	private ILog log = LogProvider.getLogger(RemoteObjectReaper.class);
	private Timer timer = new Timer();
	private long delay = 0;
	private List<AbstractRPCHandler> tasks = new ArrayList<AbstractRPCHandler>();
	
	private class CleanTask extends TimerTask {
		private AbstractRPCHandler handler;
		public CleanTask(AbstractRPCHandler h) {
			this.handler = h;
		}
		
		@Override
		public void run() {
			log.debug("Reaper is running: " + this);
			handler.cleanObjectReferences(delay);
		}
		
		public String toString() {
			return "CleanTask: [" + handler.getClass().getName() + "]";
		}
	}
	
	private static final RemoteObjectReaper reaper = new RemoteObjectReaper(180);
	public static RemoteObjectReaper getInstance() {
		return reaper; 
	}
	
	public RemoteObjectReaper(int seconds) {
		delay = seconds*1000;
		log.info("Remote Object Reaper created to monitor stale objects every " + seconds + " seconds");
	}
	
	public synchronized void manageObjects(AbstractRPCHandler handler) {
		log.info("Managing: " + handler.getClass().getName());
		tasks.add(handler);
		addTask(handler);
	}
	
	public synchronized void updateDelay(int seconds) {
		this.delay = seconds*1000;
		
		log.info("Remote Object Reaper has been changed to monitor stale objects every " + seconds + " seconds");
		timer.cancel();
		timer = new Timer();
		log.info("Moving " + tasks.size() + " tasks to the new reaper thread.");
		for (AbstractRPCHandler t : tasks) {
			addTask(t);
		}
	}

	private void addTask(AbstractRPCHandler handler) {
		CleanTask ct = new CleanTask(handler);
		timer.schedule(ct, delay, delay);
		log.info("Added Task: " + handler + " to run every " + delay + "ms");
	}
	
	public int getReaperDelay() {
		return (int)(delay/1000);
	}
}
