package net.runelite.standalone;

import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class270 {
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      longValue = 2572415098625681611L
   )
   static long field3479;
   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class303[] field3476;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class217 field3480;
   @ObfuscatedName("f")
   Inflater field3481;

   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1000000"
   )
   class270(int var1, int var2, int var3) {
   }

   public class270() {
      this(-1, 1000000, 1000000);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;[BI)V",
      garbageValue = "-565718118"
   )
   public void method5332(Buffer var1, byte[] var2) {
      if(var1.field1694[var1.field1693] == 31 && var1.field1694[var1.field1693 + 1] == -117) {
         if(this.field3481 == null) {
            this.field3481 = new Inflater(true);
         }

         try {
            this.field3481.setInput(var1.field1694, var1.field1693 + 10, var1.field1694.length - (var1.field1693 + 8 + 10));
            this.field3481.inflate(var2);
         } catch (Exception var4) {
            this.field3481.reset();
            throw new RuntimeException("");
         }

         this.field3481.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
