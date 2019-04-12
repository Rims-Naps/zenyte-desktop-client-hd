package net.runelite.standalone;

/**
 * @author Tommeh | 5-4-2019 | 16:34
 * @see <a href="https://www.rune-server.ee/members/tommeh/">Rune-Server profile</a>}
 */
public enum MemberIconType {

    NONE(-1),
    SAPPHIRE_MEMBER(0),
    EMERALD_MEMBER(1),
    RUBY_MEMBER(2),
    DIAMOND_MEMBER(3),
    DRAGONSTONE_MEMBER(4),
    ONYX_MEMBER(5),
    ZENYTE_MEMBER(6);

    private final int icon;

    MemberIconType(final int icon) {
        this.icon = icon;
    }

    public IndexedSprite getIcon() {
        return MapIconReference.memberIconSprites[icon];
    }

    public static MemberIconType get(final int index) {
        return values()[index];
    }
}
