package sagex.plugin;



/**
 * Interface definition for implementation classes that listen for events from the SageTV core
 *
 * Variable types are in brackets[] after the var name unless they are the same as the var name itself.
 * List of known core events:
 *
 * MediaFileImported - vars: MediaFile
 * ImportingStarted
 * ImportingCompleted
 * RecordingCompleted (called when a complete recording is done) - vars: MediaFile 
 * RecordingStarted (called when any kind of recording is started) - vars: MediaFile 
 * RecordingStopped (called whenever a recording is stopped for any reason) - vars: MediaFile
 * AllPluginsLoaded
 * RecordingScheduleChanged
 * ConflictStatusChanged
 * SystemMessagePosted - vars: SystemMessage
 * EPGUpdateCompleted
 * MediaFileRemoved - vars: MediaFile
 * PlaybackStopped (called when the file is closed) - vars: MediaFile, UIContext[String], Duration[Long], MediaTime[Long], ChapterNum[Integer], TitleNum[Integer]
 * PlaybackFinished (called at the EOF) - vars: MediaFile, UIContext[String], Duration[Long], MediaTime[Long], ChapterNum[Integer], TitleNum[Integer]
 * PlaybackStarted - vars: MediaFile, UIContext[String], Duration[Long], MediaTime[Long], ChapterNum[Integer], TitleNum[Integer]
 * FavoriteAdded - vars: Favorite
 * FavoriteModified - vars: Favorite
 * FavoriteRemoved - vars: Favorite
 * PlaylistAdded - vars: Playlist, UIContext[String]
 * PlaylistModified - vars: Playlist, UIContext[String]
 * PlaylistRemoved - vars: Playlist, UIContext[String]
 * ClientConnected - vars: IPAddress[String], MACAddress[String] (if its a placeshifter/extender, MACAddress is null otherwise)
 * ClientDisconnected - vars: IPAddress[String], MACAddress[String] (if its a placeshifter/extender, MACAddress is null otherwise)

 * As found in http://download.sagetv.com/SageTVEventListener.java
 * 
 * @author seans
 */
public final class SageEvents {
	 public static final String MediaFileImported="MediaFileImported";
	 public static final String ImportingStarted="ImportingStarted";
	 public static final String ImportingCompleted="ImportingCompleted";
	 public static final String RecordingCompleted="RecordingCompleted"; 
	 public static final String RecordingStarted="RecordingStarted";
	 public static final String RecordingStopped="RecordingStopped";
	 
	 /**
	  * @since 7.0.16
	  */
	 public static final String RecordingSegmentAdded="RecordingSegmentAdded";
	 
	 public static final String AllPluginsLoaded="AllPluginsLoaded";
	 
	 
	 public static final String RecordingScheduleChanged="RecordingScheduleChanged";
	 public static final String ConflictStatusChanged="ConflictStatusChanged";
	 public static final String SystemMessagePosted="SystemMessagePosted";
	 public static final String EPGUpdateCompleted="EPGUpdateCompleted";
	 public static final String MediaFileRemoved="MediaFileRemoved";
	 
	 /**
	  * @since 7.012
	  */
	 public static final String PlaybackStopped="PlaybackStopped";
	 
	 /**
	  * @since 7.012
	  */
	 public static final String PlaybackFinished="PlaybackFinished";

	 /**
	  * @since 7.012
	  */
	 public static final String PlaybackStarted="PlaybackStarted";
	 
	 /**
	  * @since 7.1.3
	  */
	 public static final String PlaybackPaused="PlaybackPaused";
	 
	 /**
	  * @since 7.1.3
	  */
	 public static final String PlaybackResumed="PlaybackResumed";
	 
	 public static final String FavoriteAdded="FavoriteAdded";
	 public static final String FavoriteModified="FavoriteModified";
	 public static final String FavoriteRemoved="FavoriteRemoved";
	 
	 public static final String PlaylistAdded="PlaylistAdded";
	 public static final String PlaylistModified="PlaylistModified";
	 public static final String PlaylistRemoved="PlaylistRemoved";
	 
	 public static final String ClientConnected="ClientConnected";
	 public static final String ClientDisconnected="ClientDisconnected";
}
