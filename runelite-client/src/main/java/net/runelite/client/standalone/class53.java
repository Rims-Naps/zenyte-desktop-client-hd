package net.runelite.client.standalone;

import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class53 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   public static class148 field391;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      longValue = 2572415098625681611L
   )
   static long field390;
   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "[Lle;"
   )
   static class32[] field387;
   @ObfuscatedName("f")
   Inflater field392;

   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1000000"
   )
   class53(int var1, int var2, int var3) {
   }

   public class53() {
      this(-1, 1000000, 1000000);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;[BI)V",
      garbageValue = "-565718118"
   )
   public void method861(Buffer var1, byte[] var2) {
      if(var1.field1074[var1.field1073] == 31 && var1.field1074[var1.field1073 + 1] == -117) {
         if(this.field392 == null) {
            this.field392 = new Inflater(true);
         }

         try {
            this.field392.setInput(var1.field1074, var1.field1073 + 10, var1.field1074.length - (var1.field1073 + 8 + 10));
            this.field392.inflate(var2);
         } catch (Exception var4) {
            this.field392.reset();
            throw new RuntimeException("");
         }

         this.field392.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
