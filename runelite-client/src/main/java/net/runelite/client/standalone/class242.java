package net.runelite.client.standalone;

import net.runelite.api.events.NameableNameChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSNameable;

@ObfuscatedName("jb")
public class class242 implements Comparable, RSNameable {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   class49 field2418;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   class49 field2417;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)Lka;",
      garbageValue = "1193914891"
   )
   public class49 method4300() {
      return this.field2417;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Lka;Lka;I)V",
      garbageValue = "844269587"
   )
   void method4304(class49 var1, class49 var2) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.field2417 = var1;
         this.field2418 = var2;
         this.onPrevNameChanged(-1);
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "93"
   )
   public String method4290() {
      return this.field2417 == null?"":this.field2417.method821();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljb;I)I",
      garbageValue = "-960653255"
   )
   public int vmethod4496(class242 var1) {
      return this.field2417.method840(var1.field2417);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-376570217"
   )
   public String method4289() {
      return this.field2418 == null?"":this.field2418.method821();
   }

   public RSName getRsPrevName() {
      return this.field2418;
   }

   public RSName getRsName() {
      return this.field2417;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onPrevNameChanged(int var1) {
      NameableNameChanged var2 = new NameableNameChanged(this);
      class113.field1064.getCallbacks().post(var2);
   }

   public int compareTo(Object var1) {
      return this.vmethod4496((class242)var1);
   }
}
