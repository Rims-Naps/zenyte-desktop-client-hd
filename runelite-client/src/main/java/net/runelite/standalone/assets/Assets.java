package net.runelite.standalone.assets;


import net.runelite.standalone.GameEngine;
import net.runelite.standalone.SpritePixels;
import net.runelite.standalone.class107;
import net.runelite.standalone.class39;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Tommeh | 27-10-2018 | 15:40
 * @see <a href="https://www.rune-server.ee/members/tommeh/">Rune-Server profile</a>}
 */
public class Assets {

    public static void init() {
        class39.leftBackground = new SpritePixels(loadImage("left3.png"), GameEngine.instance.getCanvas());
        class107.rightBackground = new SpritePixels(loadImage("right3.png"), GameEngine.instance.getCanvas());
    }

    private static byte[] loadImage(final String path) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[20000];

            InputStream resourceAsStream = Assets.class.getResourceAsStream(path);
            int x;
            while ((x = resourceAsStream.read(bytes)) > 0) {
                byteArrayOutputStream.write(bytes, 0, x);
            }
            resourceAsStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            System.err.println("Error loading image: " + path);
            e.printStackTrace();
        }
        return null;
    }
}
