package pk.streaming.redpanda.constant;

/**
 * @author rayyan
 *
 */

public class Constants {
	
	private Constants() {
		
	}
	public static final String TOPIC = "twitch_chat";
    public static final String GROUP_ID = "groupId";
    public static final Integer NUM_PARTITIONS = 1;
    public static final Short REPLICATION_FACTOR = 1;
}
