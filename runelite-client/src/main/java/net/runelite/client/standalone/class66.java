package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrameMap;

@ObfuscatedName("dg")
public class class66 implements RSFrame {
   @ObfuscatedName("f")
   static int[] field614;
   @ObfuscatedName("l")
   static int[] field615;
   @ObfuscatedName("s")
   static int[] field610;
   @ObfuscatedName("w")
   static int[] field609;
   @ObfuscatedName("m")
   int[] field616;
   @ObfuscatedName("r")
   int[] field608;
   @ObfuscatedName("p")
   int[] field617;
   @ObfuscatedName("c")
   int[] field613;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldq;"
   )
   class29 field611;
   @ObfuscatedName("a")
   int field612;
   @ObfuscatedName("d")
   boolean field607;

   static {
      field614 = new int[500];
      field615 = new int[500];
      field609 = new int[500];
      field610 = new int[500];
   }

   @ObfuscatedSignature(
      signature = "([BLdq;)V"
   )
   class66(byte[] var1, class29 var2) {
      this.field611 = null;
      this.field612 = -1;
      this.field607 = false;
      this.field611 = var2;
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      var3.field1073 = 2;
      int var5 = var3.readUnsignedByte();
      int var6 = -1;
      int var7 = 0;
      var4.field1073 = var5 + var3.field1073;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte();
         if(var9 > 0) {
            if(this.field611.field222[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if(this.field611.field222[var10] == 0) {
                     field614[var7] = var10;
                     field615[var7] = 0;
                     field609[var7] = 0;
                     field610[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field614[var7] = var8;
            short var11 = 0;
            if(this.field611.field222[var8] == 3) {
               var11 = 128;
            }

            if((var9 & 1) != 0) {
               field615[var7] = var4.method1988();
            } else {
               field615[var7] = var11;
            }

            if((var9 & 2) != 0) {
               field609[var7] = var4.method1988();
            } else {
               field609[var7] = var11;
            }

            if((var9 & 4) != 0) {
               field610[var7] = var4.method1988();
            } else {
               field610[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if(this.field611.field222[var8] == 5) {
               this.field607 = true;
            }
         }
      }

      if(var1.length != var4.field1073) {
         throw new RuntimeException();
      } else {
         this.field612 = var7;
         this.field613 = new int[var7];
         this.field617 = new int[var7];
         this.field608 = new int[var7];
         this.field616 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field613[var8] = field614[var8];
            this.field617[var8] = field615[var8];
            this.field608[var8] = field609[var8];
            this.field616[var8] = field610[var8];
         }

      }
   }

   public RSFrameMap getSkin() {
      return this.field611;
   }

   public int getTransformCount() {
      return this.field612;
   }

   public int[] getTransformTypes() {
      return this.field613;
   }

   public int[] getTranslatorX() {
      return this.field617;
   }

   public int[] getTranslatorY() {
      return this.field608;
   }

   public int[] getTranslatorZ() {
      return this.field616;
   }

   public boolean isShowing() {
      return this.field607;
   }
}
