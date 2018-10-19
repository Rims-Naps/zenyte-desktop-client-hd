package net.runelite.client.standalone;

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
public abstract class class209 implements RSNameableContainer {
   @ObfuscatedName("r")
   Comparator field2037;
   @ObfuscatedName("p")
   HashMap field2032;
   @ObfuscatedName("c")
   HashMap field2035;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1474250383
   )
   int field2034;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 431571553
   )
   final int field2036;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Ljb;"
   )
   class242[] field2033;

   class209(int var1) {
      this.field2034 = 0;
      this.field2037 = null;
      this.field2036 = var1;
      this.field2033 = this.vmethod3641(var1);
      this.field2035 = new HashMap(var1 / 8);
      this.field2032 = new HashMap(var1 / 8);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Lka;Lka;I)Ljb;",
      garbageValue = "1263064830"
   )
   class242 method3648(class49 var1, class49 var2) {
      if(this.method3626(var1) != null) {
         throw new IllegalStateException();
      } else {
         class242 var3 = this.vmethod3645();
         var3.method4304(var1, var2);
         this.method3640(var3);
         this.method3638(var3);
         return var3;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljb;I)V",
      garbageValue = "2122124306"
   )
   final void method3636(class242 var1) {
      if(this.field2035.remove(var1.field2417) == null) {
         throw new IllegalStateException();
      } else {
         if(var1.field2418 != null) {
            this.field2032.remove(var1.field2418);
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Ljb;",
      garbageValue = "893739968"
   )
   abstract class242 vmethod3645();

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2138090786"
   )
   public void method3621() {
      this.field2034 = 0;
      Arrays.fill(this.field2033, (Object)null);
      this.field2035.clear();
      this.field2032.clear();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ljb;Lka;Lka;I)V",
      garbageValue = "2136874103"
   )
   final void method3690(class242 var1, class49 var2, class49 var3) {
      this.method3636(var1);
      var1.method4304(var2, var3);
      this.method3638(var1);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-839196501"
   )
   public final void method3674() {
      this.field2037 = null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lka;I)Ljb;",
      garbageValue = "298123366"
   )
   class242 method3627(class49 var1) {
      return !var1.method822()?null:(class242)this.field2032.get(var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lka;I)Ljb;",
      garbageValue = "-1610693265"
   )
   class242 method3630(class49 var1) {
      return this.method3648(var1, (class49)null);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljb;I)V",
      garbageValue = "765441315"
   )
   final void method3638(class242 var1) {
      this.field2035.put(var1.field2417, var1);
      if(var1.field2418 != null) {
         class242 var2 = (class242)this.field2032.put(var1.field2418, var1);
         if(var2 != null && var2 != var1) {
            var2.field2418 = null;
            var2.onPrevNameChanged(-1);
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "7"
   )
   public boolean method3623() {
      return this.field2036 == this.field2034;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IS)[Ljb;",
      garbageValue = "14604"
   )
   abstract class242[] vmethod3641(int var1);

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(II)Ljb;",
      garbageValue = "601257074"
   )
   public final class242 method3620(int var1) {
      if(var1 >= 0 && var1 < this.field2034) {
         return this.field2033[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lka;B)Z",
      garbageValue = "23"
   )
   public boolean method3624(class49 var1) {
      return !var1.method822()?false:(this.field2035.containsKey(var1)?true:this.field2032.containsKey(var1));
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1361081889"
   )
   public int method3635() {
      return this.field2034;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "-1809280644"
   )
   public final void method3643(Comparator var1) {
      if(this.field2037 == null) {
         this.field2037 = var1;
      } else if(this.field2037 instanceof class236) {
         ((class236)this.field2037).method4177(var1);
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lka;B)Ljb;",
      garbageValue = "1"
   )
   class242 method3626(class49 var1) {
      return !var1.method822()?null:(class242)this.field2035.get(var1);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Ljb;I)V",
      garbageValue = "-1957664346"
   )
   final void method3640(class242 var1) {
      this.field2033[++this.field2034 - 1] = var1;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lka;I)Ljb;",
      garbageValue = "-1038084456"
   )
   public class242 method3625(class49 var1) {
      class242 var2 = this.method3626(var1);
      return var2 != null?var2:this.method3627(var1);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ljb;I)I",
      garbageValue = "-1375357219"
   )
   final int method3650(class242 var1) {
      for(int var2 = 0; var2 < this.field2034; ++var2) {
         if(this.field2033[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Lka;I)Z",
      garbageValue = "65280"
   )
   public final boolean method3628(class49 var1) {
      class242 var2 = this.method3626(var1);
      if(var2 == null) {
         return false;
      } else {
         this.method3629(var2);
         return true;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-718261067"
   )
   public final void method3633() {
      if(this.field2037 == null) {
         Arrays.sort(this.field2033, 0, this.field2034);
      } else {
         Arrays.sort(this.field2033, 0, this.field2034, this.field2037);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-29131629"
   )
   final void method3639(int var1) {
      --this.field2034;
      if(var1 < this.field2034) {
         System.arraycopy(this.field2033, var1 + 1, this.field2033, var1, this.field2034 - var1);
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ljb;I)V",
      garbageValue = "1343208602"
   )
   final void method3629(class242 var1) {
      int var2 = this.method3650(var1);
      if(var2 != -1) {
         this.method3639(var2);
         this.method3636(var1);
      }
   }

   public int getCount() {
      return this.field2034;
   }

   public RSNameable[] getNameables() {
      return this.field2033;
   }

   public boolean isMember(RSName var1) {
      return this.method3624((class49)var1);
   }
}
