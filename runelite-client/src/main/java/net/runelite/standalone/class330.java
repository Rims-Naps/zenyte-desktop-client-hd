package net.runelite.standalone;

import net.runelite.api.events.NameableNameChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSNameable;

@ObfuscatedName("jb")
public class class330 implements Comparable, RSNameable {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   class158 field3986;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   class158 field3985;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)Lka;",
      garbageValue = "-1489101742"
   )
   public class158 method6338() {
      return this.field3985;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Lka;Lka;I)V",
      garbageValue = "844269587"
   )
   void method6342(class158 var1, class158 var2) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.field3985 = var1;
         this.field3986 = var2;
         this.onPrevNameChanged(-1);
      }
   }

   public RSName getRsPrevName() {
      return this.field3986;
   }

   public RSName getRsName() {
      return this.field3985;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onPrevNameChanged(int var1) {
      NameableNameChanged var2 = new NameableNameChanged(this);
      class302.field3755.getCallbacks().post(var2);
   }

   public int compareTo(Object var1) {
      return this.vmethod6331((class330)var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-376570217"
   )
   public String method6327() {
      return this.field3986 == null?"":this.field3986.method2869();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljb;I)I",
      garbageValue = "-960653255"
   )
   public int vmethod6331(class330 var1) {
      return this.field3985.method2888(var1.field3985);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "93"
   )
   public String method6328() {
      return this.field3985 == null?"":this.field3985.method2869();
   }
}
