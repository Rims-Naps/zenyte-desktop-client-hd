package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFriend;
import net.runelite.rs.api.RSName;

@ObfuscatedName("kk")
public class class73 extends class62 implements RSFriend {
   @ObfuscatedName("l")
   boolean field834;
   @ObfuscatedName("f")
   boolean field835;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkk;I)I",
      garbageValue = "2072448265"
   )
   int method1549(class73 var1) {
      return super.field737 == client.field2206 && client.field2206 != var1.field737?-1:(client.field2206 == var1.field737 && super.field737 != client.field2206?1:(super.field737 != 0 && var1.field737 == 0?-1:(var1.field737 != 0 && super.field737 == 0?1:(this.field835 && !var1.field835?-1:(!this.field835 && var1.field835?1:(this.field834 && !var1.field834?-1:(!this.field834 && var1.field834?1:(super.field737 != 0?super.field734 - var1.field734:var1.field734 - super.field734))))))));
   }

   public int compareTo(Object var1) {
      return this.method1549((class73)var1);
   }

   public String getName() {
      return this.getRsName().getName();
   }

   public String getPrevName() {
      RSName var1 = this.getRsPrevName();
      return var1 == null?null:var1.getName();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljb;I)I",
      garbageValue = "-960653255"
   )
   public int vmethod6331(class330 var1) {
      return this.method1549((class73)var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IZI)Ljava/lang/String;",
      garbageValue = "162737536"
   )
   public static String method1557(int var0, boolean var1) {
      return var1 && var0 >= 0?class250.method5065(var0, 10, var1):Integer.toString(var0);
   }
}
