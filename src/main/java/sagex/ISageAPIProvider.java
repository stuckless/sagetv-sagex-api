package sagex;

public interface ISageAPIProvider {
	public Object callService(String name, Object[] args) throws Exception;
	public Object callService(String context, String name, Object[] args) throws Exception;
}
