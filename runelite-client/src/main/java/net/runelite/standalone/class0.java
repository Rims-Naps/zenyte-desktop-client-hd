package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrameMap;

@ObfuscatedName("dg")
public class class0 implements RSFrame {
   @ObfuscatedName("l")
   static int[] field8;
   @ObfuscatedName("s")
   static int[] field3;
   @ObfuscatedName("f")
   static int[] field7;
   @ObfuscatedName("w")
   static int[] field2;
   @ObfuscatedName("p")
   int[] field10;
   @ObfuscatedName("c")
   int[] field6;
   @ObfuscatedName("r")
   int[] field1;
   @ObfuscatedName("m")
   int[] field9;
   @ObfuscatedName("d")
   boolean field0;
   @ObfuscatedName("a")
   int field5;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldq;"
   )
   class141 field4;

   static {
      field7 = new int[500];
      field8 = new int[500];
      field2 = new int[500];
      field3 = new int[500];
   }

   @ObfuscatedSignature(
      signature = "([BLdq;)V"
   )
   class0(byte[] var1, class141 var2) {
      this.field4 = null;
      this.field5 = -1;
      this.field0 = false;
      this.field4 = var2;
      class125 var3 = new class125(var1);
      class125 var4 = new class125(var1);
      var3.field1693 = 2;
      int var5 = var3.method2256();
      int var6 = -1;
      int var7 = 0;
      var4.field1693 = var5 + var3.field1693;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.method2256();
         if(var9 > 0) {
            if(this.field4.field1798[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if(this.field4.field1798[var10] == 0) {
                     field7[var7] = var10;
                     field8[var7] = 0;
                     field2[var7] = 0;
                     field3[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field7[var7] = var8;
            short var11 = 0;
            if(this.field4.field1798[var8] == 3) {
               var11 = 128;
            }

            if((var9 & 1) != 0) {
               field8[var7] = var4.method2339();
            } else {
               field8[var7] = var11;
            }

            if((var9 & 2) != 0) {
               field2[var7] = var4.method2339();
            } else {
               field2[var7] = var11;
            }

            if((var9 & 4) != 0) {
               field3[var7] = var4.method2339();
            } else {
               field3[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if(this.field4.field1798[var8] == 5) {
               this.field0 = true;
            }
         }
      }

      if(var1.length != var4.field1693) {
         throw new RuntimeException();
      } else {
         this.field5 = var7;
         this.field6 = new int[var7];
         this.field10 = new int[var7];
         this.field1 = new int[var7];
         this.field9 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field6[var8] = field7[var8];
            this.field10[var8] = field8[var8];
            this.field1[var8] = field2[var8];
            this.field9[var8] = field3[var8];
         }

      }
   }

   public RSFrameMap getSkin() {
      return this.field4;
   }

   public int getTransformCount() {
      return this.field5;
   }

   public int[] getTransformTypes() {
      return this.field6;
   }

   public int[] getTranslatorX() {
      return this.field10;
   }

   public int[] getTranslatorY() {
      return this.field1;
   }

   public int[] getTranslatorZ() {
      return this.field9;
   }

   public boolean isShowing() {
      return this.field0;
   }
}
