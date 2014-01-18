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
 * @deprecated use the contstants class.  Enums can't be used in the SageEvent annotation
 * @author seans
 */
@Deprecated
public enum SageEventEnum {
	 MediaFileImported,
	 ImportingStarted,
	 ImportingCompleted,
	 RecordingCompleted, 
	 RecordingStarted,
	 RecordingStopped,
	 AllPluginsLoaded,
	 RecordingScheduleChanged,
	 ConflictStatusChanged,
	 SystemMessagePosted,
	 EPGUpdateCompleted,
	 MediaFileRemoved,
	 PlaybackStopped,
	 PlaybackFinished,
	 PlaybackStarted,
	 FavoriteAdded,
	 FavoriteModified,
	 FavoriteRemoved,
	 PlaylistAdded,
	 PlaylistModified,
	 PlaylistRemoved,
	 ClientConnected,
	 ClientDisconnected
}
