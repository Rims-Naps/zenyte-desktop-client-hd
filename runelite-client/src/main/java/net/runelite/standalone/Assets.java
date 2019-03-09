package net.runelite.standalone;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * @author Tommeh | 27-10-2018 | 15:40
 * @see <a href="https://www.rune-server.ee/members/tommeh/">Rune-Server profile</a>}
 */
public class Assets {

    public static void init() {
        class316.leftBackground = new SpritePixels(loadImage("left1.png"), GameEngine.shell.getCanvas());
        class316.rightBackground = new SpritePixels(loadImage("right1.png"), GameEngine.shell.getCanvas());
    }

    private static byte[] loadImage(final String path) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[20000];

            InputStream resourceAsStream = Assets.class.getResourceAsStream(path);
            int len;
            while ((len = resourceAsStream.read(bytes)) > 0) {
                byteArrayOutputStream.write(bytes, 0, len);
            }
            resourceAsStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            System.err.println("Error loading image: " + path);
            e.printStackTrace();
        }
        return null;
    }
}
