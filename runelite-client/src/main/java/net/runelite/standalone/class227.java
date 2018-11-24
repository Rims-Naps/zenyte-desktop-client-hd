package net.runelite.standalone;

import net.runelite.api.ChatMessageType;
import net.runelite.api.events.SetMessage;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMessageNode;

@ObfuscatedName("bm")
public class class227 extends class324 implements RSMessageNode {
   @ObfuscatedName("p")
   String field3049;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class75 field3054;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -918170887
   )
   int field3048;
   @ObfuscatedName("s")
   String field3053;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1155825515
   )
   int field3056;
   @ObfuscatedName("r")
   String field3051;
   public String runeLiteFormatMessage;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class75 field3055;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   class158 field3052;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1917353869
   )
   int field3050;

   class227(int var1, String var2, String var3, String var4) {
      this.field3055 = class75.field850;
      this.field3054 = class75.field850;
      int var5 = ++class38.field369 - 1;
      this.field3056 = var5;
      this.field3048 = client.field2165;
      this.field3050 = var1;
      this.field3053 = var2;
      this.method4593();
      this.field3049 = var3;
      this.field3051 = var4;
      this.rl$$init();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "209702229"
   )
   void method4577() {
      this.field3054 = class202.field2845.field1948.method3030(this.field3052)?class75.field849:class75.field851;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-39"
   )
   final boolean method4576() {
      if(this.field3054 == class75.field850) {
         this.method4577();
      }

      return this.field3054 == class75.field849;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1675389507"
   )
   void method4596() {
      this.field3055 = class75.field850;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1832709435"
   )
   void method4574() {
      this.field3055 = class202.field2845.field1946.method3030(this.field3052)?class75.field849:class75.field851;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
      garbageValue = "-4577"
   )
   void method4571(int var1, String var2, String var3, String var4) {
      int var5 = ++class38.field369 - 1;
      this.field3056 = var5;
      this.field3048 = client.field2165;
      this.field3050 = var1;
      this.field3053 = var2;
      this.method4593();
      this.field3049 = var3;
      this.field3051 = var4;
      this.setMessage(var1, var2, var3, var4);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2126271907"
   )
   final void method4593() {
      if(this.field3053 != null) {
         this.field3052 = new class158(class216.method4394(this.field3053), class140.field1794);
      } else {
         this.field3052 = null;
      }

   }

   public int getRSType() {
      return this.field3050;
   }

   public ChatMessageType getType() {
      return ChatMessageType.of(this.getRSType());
   }

   public String getName() {
      return this.field3053;
   }

   public String getSender() {
      return this.field3049;
   }

   public String getValue() {
      return this.field3051;
   }

   public void setMessage(int var1, String var2, String var3, String var4) {
      this.runeLiteFormatMessage = null;
      SetMessage var5 = new SetMessage();
      var5.setMessageNode(this);
      var5.setType(ChatMessageType.of(var1));
      var5.setName(var2);
      var5.setSender(var3);
      var5.setValue(var4);
      class302.field3755.getCallbacks().post(var5);
   }

   private void rl$$init() {
      SetMessage var1 = new SetMessage();
      var1.setMessageNode(this);
      var1.setType(this.getType());
      var1.setName(this.getName());
      var1.setSender(this.getSender());
      var1.setValue(this.getValue());
      class302.field3755.getCallbacks().post(var1);
   }

   public String getRuneLiteFormatMessage() {
      return this.runeLiteFormatMessage;
   }

   public void setRuneLiteFormatMessage(String var1) {
      this.runeLiteFormatMessage = var1;
   }

   public void setName(String var1) {
      this.field3053 = var1;
   }

   public void setSender(String var1) {
      this.field3049 = var1;
   }

   public void setValue(String var1) {
      this.field3051 = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "287785552"
   )
   void method4591() {
      this.field3054 = class75.field850;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1968536231"
   )
   final boolean method4573() {
      if(this.field3055 == class75.field850) {
         this.method4574();
      }

      return this.field3055 == class75.field849;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;Lga;I)Lga;",
      garbageValue = "-1823903516"
   )
   static final class235 method4570(class125 var0, class235 var1) {
      int var2 = var0.method2256();
      int var3;
      if(var1 == null) {
         int var4 = var2 - 1;
         var4 |= var4 >>> 1;
         var4 |= var4 >>> 2;
         var4 |= var4 >>> 4;
         var4 |= var4 >>> 8;
         var4 |= var4 >>> 16;
         var3 = var4 + 1;
         var1 = new class235(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var7 = var0.method2256() == 1;
         int var5 = var0.method2260();
         Object var6;
         if(var7) {
            var6 = new class196(var0.method2265());
         } else {
            var6 = new class228(var0.method2344());
         }

         var1.method4672((class197)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "919466790"
   )
   public static void method4585() {
      while(true) {
         class70 var1 = class325.field3951;
         class192 var0;
         synchronized(class325.field3951) {
            var0 = (class192)class325.field3947.method1498();
         }

         if(var0 == null) {
            return;
         }

         var0.field2744.method102(var0.field2741, (int)var0.field2792, var0.field2742, false);
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "1882327200"
   )
   static byte[] method4595(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }
}
