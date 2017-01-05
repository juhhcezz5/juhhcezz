package sx.blah.discord.handle.impl.events.guild.member;

import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

/**
 * This event is dispatched when a user is banned from a guild.
 */
public class UserBanEvent extends GuildMemberEvent {
	
	public UserBanEvent(IGuild guild, IUser user) {
		super(guild, user);
	}
}