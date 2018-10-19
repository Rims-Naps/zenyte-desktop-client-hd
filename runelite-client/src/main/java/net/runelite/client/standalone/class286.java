package net.runelite.client.standalone;

import net.runelite.api.ChatMessageType;
import net.runelite.api.events.SetMessage;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMessageNode;

@ObfuscatedName("bm")
public class class286 extends class193 implements RSMessageNode {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1155825515
   )
   int field3113;
   @ObfuscatedName("r")
   String field3108;
   @ObfuscatedName("p")
   String field3106;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class149 field3111;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   class49 field3109;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -918170887
   )
   int field3105;
   @ObfuscatedName("s")
   String field3110;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkg;"
   )
   class149 field3112;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1917353869
   )
   int field3107;
   public String runeLiteFormatMessage;

   class286(int var1, String var2, String var3, String var4) {
      this.field3112 = class149.field1427;
      this.field3111 = class149.field1427;
      int var5 = ++class297.field3196 - 1;
      this.field3113 = var5;
      this.field3105 = client.field3744;
      this.field3107 = var1;
      this.field3110 = var2;
      this.method5060();
      this.field3106 = var3;
      this.field3108 = var4;
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
      garbageValue = "-4577"
   )
   void method5038(int var1, String var2, String var3, String var4) {
      int var5 = ++class297.field3196 - 1;
      this.field3113 = var5;
      this.field3105 = client.field3744;
      this.field3107 = var1;
      this.field3110 = var2;
      this.method5060();
      this.field3106 = var3;
      this.field3108 = var4;
      this.setMessage(var1, var2, var3, var4);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2126271907"
   )
   final void method5060() {
      if(this.field3110 != null) {
         this.field3109 = new class49(class298.method5189(this.field3110), class36.field277);
      } else {
         this.field3109 = null;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "209702229"
   )
   void method5044() {
      this.field3111 = class295.field3180.field3522.method3624(this.field3109)?class149.field1426:class149.field1428;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-39"
   )
   final boolean method5043() {
      if(this.field3111 == class149.field1427) {
         this.method5044();
      }

      return this.field3111 == class149.field1426;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "287785552"
   )
   void method5058() {
      this.field3111 = class149.field1427;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1675389507"
   )
   void method5063() {
      this.field3112 = class149.field1427;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1832709435"
   )
   void method5041() {
      this.field3112 = class295.field3180.field3520.method3624(this.field3109)?class149.field1426:class149.field1428;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1968536231"
   )
   final boolean method5040() {
      if(this.field3112 == class149.field1427) {
         this.method5041();
      }

      return this.field3112 == class149.field1426;
   }

   public int getRSType() {
      return this.field3107;
   }

   public ChatMessageType getType() {
      return ChatMessageType.of(this.getRSType());
   }

   public String getName() {
      return this.field3110;
   }

   public String getSender() {
      return this.field3106;
   }

   public String getValue() {
      return this.field3108;
   }

   public void setMessage(int var1, String var2, String var3, String var4) {
      this.runeLiteFormatMessage = null;
      SetMessage var5 = new SetMessage();
      var5.setMessageNode(this);
      var5.setType(ChatMessageType.of(var1));
      var5.setName(var2);
      var5.setSender(var3);
      var5.setValue(var4);
      class113.field1064.getCallbacks().post(var5);
   }

   private void rl$$init() {
      SetMessage var1 = new SetMessage();
      var1.setMessageNode(this);
      var1.setType(this.getType());
      var1.setName(this.getName());
      var1.setSender(this.getSender());
      var1.setValue(this.getValue());
      class113.field1064.getCallbacks().post(var1);
   }

   public String getRuneLiteFormatMessage() {
      return this.runeLiteFormatMessage;
   }

   public void setRuneLiteFormatMessage(String var1) {
      this.runeLiteFormatMessage = var1;
   }

   public void setName(String var1) {
      this.field3110 = var1;
   }

   public void setSender(String var1) {
      this.field3106 = var1;
   }

   public void setValue(String var1) {
      this.field3108 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgm;Lga;I)Lga;",
      garbageValue = "-407201976"
   )
   static final class46 method5037(Buffer var0, class46 var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if(var1 == null) {
         int var4 = var2 - 1;
         var4 |= var4 >>> 1;
         var4 |= var4 >>> 2;
         var4 |= var4 >>> 4;
         var4 |= var4 >>> 8;
         var4 |= var4 >>> 16;
         var3 = var4 + 1;
         var1 = new class46(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var7 = var0.readUnsignedByte() == 1;
         int var5 = var0.method1909();
         Object var6;
         if(var7) {
            var6 = new class97(var0.readString());
         } else {
            var6 = new class262(var0.readInt());
         }

         var1.method794((class76)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "919466790"
   )
   public static void method5052() {
      while(true) {
         class320 var1 = class94.field895;
         class167 var0;
         synchronized(class94.field895) {
            var0 = (class167)class94.field891.method5599();
         }

         if(var0 == null) {
            return;
         }

         var0.field1543.method1799(var0.field1540, (int)var0.field704, var0.field1541, false);
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "1882327200"
   )
   static byte[] method5062(byte[] var0) {
      int var1 = var0.length;
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }
}
