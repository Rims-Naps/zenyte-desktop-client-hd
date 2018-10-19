package net.runelite.client.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFriend;
import net.runelite.rs.api.RSName;

@ObfuscatedName("kk")
public class class155 extends class305 implements RSFriend {
   @ObfuscatedName("f")
   boolean field1482;
   @ObfuscatedName("l")
   boolean field1481;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkk;I)I",
      garbageValue = "2072448265"
   )
   int method2718(class155 var1) {
      return super.field3265 == client.field3785 && client.field3785 != var1.field3265?-1:(client.field3785 == var1.field3265 && super.field3265 != client.field3785?1:(super.field3265 != 0 && var1.field3265 == 0?-1:(var1.field3265 != 0 && super.field3265 == 0?1:(this.field1482 && !var1.field1482?-1:(!this.field1482 && var1.field1482?1:(this.field1481 && !var1.field1481?-1:(!this.field1481 && var1.field1481?1:(super.field3265 != 0?super.field3262 - var1.field3262:var1.field3262 - super.field3262))))))));
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljb;I)I",
      garbageValue = "-960653255"
   )
   public int vmethod4496(class242 var1) {
      return this.method2718((class155)var1);
   }

   public int compareTo(Object var1) {
      return this.method2718((class155)var1);
   }

   public String getName() {
      return this.getRsName().getName();
   }

   public String getPrevName() {
      RSName var1 = this.getRsPrevName();
      return var1 == null?null:var1.getName();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IZI)Ljava/lang/String;",
      garbageValue = "162737536"
   )
   public static String method2726(int var0, boolean var1) {
      return var1 && var0 >= 0?class165.method2842(var0, 10, var1):Integer.toString(var0);
   }
}
