package net.runelite.standalone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSNameable;
import net.runelite.rs.api.RSNameableContainer;

@ObfuscatedName("ks")
public abstract class class168 implements RSNameableContainer {
   @ObfuscatedName("p")
   HashMap field2011;
   @ObfuscatedName("c")
   HashMap field2014;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 431571553
   )
   final int field2015;
   @ObfuscatedName("r")
   Comparator field2016;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Ljb;"
   )
   class330[] field2012;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1474250383
   )
   int field2013;

   class168(int var1) {
      this.field2013 = 0;
      this.field2016 = null;
      this.field2015 = var1;
      this.field2012 = this.vmethod6017(var1);
      this.field2014 = new HashMap(var1 / 8);
      this.field2011 = new HashMap(var1 / 8);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Lka;Lka;I)Ljb;",
      garbageValue = "1263064830"
   )
   class330 method3054(class158 var1, class158 var2) {
      if(this.method3032(var1) != null) {
         throw new IllegalStateException();
      } else {
         class330 var3 = this.vmethod6016();
         var3.method6342(var1, var2);
         this.method3046(var3);
         this.method3044(var3);
         return var3;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lka;B)Ljb;",
      garbageValue = "1"
   )
   class330 method3032(class158 var1) {
      return !var1.method2870()?null:(class330)this.field2014.get(var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lka;I)Ljb;",
      garbageValue = "-1610693265"
   )
   class330 method3036(class158 var1) {
      return this.method3054(var1, (class158)null);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ljb;Lka;Lka;I)V",
      garbageValue = "2136874103"
   )
   final void method3096(class330 var1, class158 var2, class158 var3) {
      this.method3042(var1);
      var1.method6342(var2, var3);
      this.method3044(var1);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "-1809280644"
   )
   public final void method3049(Comparator var1) {
      if(this.field2016 == null) {
         this.field2016 = var1;
      } else if(this.field2016 instanceof class320) {
         ((class320)this.field2016).method6238(var1);
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lka;I)Ljb;",
      garbageValue = "-1038084456"
   )
   public class330 method3031(class158 var1) {
      class330 var2 = this.method3032(var1);
      return var2 != null?var2:this.method3033(var1);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Ljb;I)V",
      garbageValue = "-1957664346"
   )
   final void method3046(class330 var1) {
      this.field2012[++this.field2013 - 1] = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljb;I)V",
      garbageValue = "2122124306"
   )
   final void method3042(class330 var1) {
      if(this.field2014.remove(var1.field3985) == null) {
         throw new IllegalStateException();
      } else {
         if(var1.field3986 != null) {
            this.field2011.remove(var1.field3986);
         }

      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)[Ljb;",
      garbageValue = "14604"
   )
   abstract class330[] vmethod6017(int var1);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljb;",
      garbageValue = "893739968"
   )
   abstract class330 vmethod6016();

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "7"
   )
   public boolean method3029() {
      return this.field2015 == this.field2013;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Lka;I)Z",
      garbageValue = "65280"
   )
   public final boolean method3034(class158 var1) {
      class330 var2 = this.method3032(var1);
      if(var2 == null) {
         return false;
      } else {
         this.method3035(var2);
         return true;
      }
   }

   public int getCount() {
      return this.field2013;
   }

   public RSNameable[] getNameables() {
      return this.field2012;
   }

   public boolean isMember(RSName var1) {
      return this.method3030((class158)var1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2138090786"
   )
   public void method3027() {
      this.field2013 = 0;
      Arrays.fill(this.field2012, (Object)null);
      this.field2014.clear();
      this.field2011.clear();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ljb;I)V",
      garbageValue = "1343208602"
   )
   final void method3035(class330 var1) {
      int var2 = this.method3056(var1);
      if(var2 != -1) {
         this.method3045(var2);
         this.method3042(var1);
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-718261067"
   )
   public final void method3039() {
      if(this.field2016 == null) {
         Arrays.sort(this.field2012, 0, this.field2013);
      } else {
         Arrays.sort(this.field2012, 0, this.field2013, this.field2016);
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljb;I)V",
      garbageValue = "765441315"
   )
   final void method3044(class330 var1) {
      this.field2014.put(var1.field3985, var1);
      if(var1.field3986 != null) {
         class330 var2 = (class330)this.field2011.put(var1.field3986, var1);
         if(var2 != null && var2 != var1) {
            var2.field3986 = null;
            var2.onPrevNameChanged(-1);
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljb;I)I",
      garbageValue = "-1375357219"
   )
   final int method3056(class330 var1) {
      for(int var2 = 0; var2 < this.field2013; ++var2) {
         if(this.field2012[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lka;B)Z",
      garbageValue = "23"
   )
   public boolean method3030(class158 var1) {
      return !var1.method2870()?false:(this.field2014.containsKey(var1)?true:this.field2011.containsKey(var1));
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1361081889"
   )
   public int method3041() {
      return this.field2013;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-839196501"
   )
   public final void method3080() {
      this.field2016 = null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lka;I)Ljb;",
      garbageValue = "298123366"
   )
   class330 method3033(class158 var1) {
      return !var1.method2870()?null:(class330)this.field2011.get(var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-29131629"
   )
   final void method3045(int var1) {
      --this.field2013;
      if(var1 < this.field2013) {
         System.arraycopy(this.field2012, var1 + 1, this.field2012, var1, this.field2013 - var1);
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(II)Ljb;",
      garbageValue = "601257074"
   )
   public final class330 method3026(int var1) {
      if(var1 >= 0 && var1 < this.field2013) {
         return this.field2012[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }
}
