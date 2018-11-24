package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class243 extends class309 {
   @ObfuscatedName("j")
   int field3274;
   @ObfuscatedName("z")
   boolean field3261;
   @ObfuscatedName("p")
   int field3266;
   @ObfuscatedName("c")
   int field3265;
   @ObfuscatedName("l")
   int field3262;
   @ObfuscatedName("s")
   int field3268;
   @ObfuscatedName("f")
   int field3271;
   @ObfuscatedName("r")
   int field3267;
   @ObfuscatedName("m")
   int field3263;
   @ObfuscatedName("x")
   int field3264;
   @ObfuscatedName("v")
   int field3272;
   @ObfuscatedName("d")
   int field3269;
   @ObfuscatedName("a")
   int field3270;
   @ObfuscatedName("g")
   int field3273;
   @ObfuscatedName("e")
   int field3260;

   @ObfuscatedSignature(
      signature = "(Lcr;III)V"
   )
   class243(class33 var1, int var2, int var3, int var4) {
      super.field3816 = var1;
      this.field3263 = var1.field308;
      this.field3269 = var1.field306;
      this.field3261 = var1.field309;
      this.field3262 = var2;
      this.field3268 = var3;
      this.field3260 = var4;
      this.field3271 = 0;
      this.method4920();
   }

   @ObfuscatedSignature(
      signature = "(Lcr;II)V"
   )
   class243(class33 var1, int var2, int var3) {
      super.field3816 = var1;
      this.field3263 = var1.field308;
      this.field3269 = var1.field306;
      this.field3261 = var1.field309;
      this.field3262 = var2;
      this.field3268 = var3;
      this.field3260 = 8192;
      this.field3271 = 0;
      this.method4920();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method4826() {
      this.field3262 = (this.field3262 ^ this.field3262 >> 31) + (this.field3262 >>> 31);
      this.field3262 = -this.field3262;
   }

   @ObfuscatedName("z")
   public synchronized void vmethod6061(int var1) {
      if(this.field3264 > 0) {
         if(var1 >= this.field3264) {
            if(this.field3268 == Integer.MIN_VALUE) {
               this.field3268 = 0;
               this.field3266 = 0;
               this.field3265 = 0;
               this.field3270 = 0;
               this.method3937();
               var1 = this.field3264;
            }

            this.field3264 = 0;
            this.method4920();
         } else {
            this.field3270 += this.field3272 * var1;
            this.field3265 += this.field3273 * var1;
            this.field3266 += this.field3274 * var1;
            this.field3264 -= var1;
         }
      }

      class33 var2 = (class33)super.field3816;
      int var3 = this.field3263 << 8;
      int var4 = this.field3269 << 8;
      int var5 = var2.field307.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.field3267 = 0;
      }

      if(this.field3271 < 0) {
         if(this.field3262 <= 0) {
            this.method4780();
            this.method3937();
            return;
         }

         this.field3271 = 0;
      }

      if(this.field3271 >= var5) {
         if(this.field3262 >= 0) {
            this.method4780();
            this.method3937();
            return;
         }

         this.field3271 = var5 - 1;
      }

      this.field3271 += this.field3262 * var1;
      if(this.field3267 < 0) {
         if(!this.field3261) {
            if(this.field3262 < 0) {
               if(this.field3271 >= var3) {
                  return;
               }

               this.field3271 = var4 - 1 - (var4 - 1 - this.field3271) % var6;
            } else {
               if(this.field3271 < var4) {
                  return;
               }

               this.field3271 = var3 + (this.field3271 - var3) % var6;
            }

         } else {
            if(this.field3262 < 0) {
               if(this.field3271 >= var3) {
                  return;
               }

               this.field3271 = var3 + var3 - 1 - this.field3271;
               this.field3262 = -this.field3262;
            }

            while(this.field3271 >= var4) {
               this.field3271 = var4 + var4 - 1 - this.field3271;
               this.field3262 = -this.field3262;
               if(this.field3271 >= var3) {
                  return;
               }

               this.field3271 = var3 + var3 - 1 - this.field3271;
               this.field3262 = -this.field3262;
            }

         }
      } else {
         if(this.field3267 > 0) {
            if(this.field3261) {
               label123: {
                  if(this.field3262 < 0) {
                     if(this.field3271 >= var3) {
                        return;
                     }

                     this.field3271 = var3 + var3 - 1 - this.field3271;
                     this.field3262 = -this.field3262;
                     if(--this.field3267 == 0) {
                        break label123;
                     }
                  }

                  do {
                     if(this.field3271 < var4) {
                        return;
                     }

                     this.field3271 = var4 + var4 - 1 - this.field3271;
                     this.field3262 = -this.field3262;
                     if(--this.field3267 == 0) {
                        break;
                     }

                     if(this.field3271 >= var3) {
                        return;
                     }

                     this.field3271 = var3 + var3 - 1 - this.field3271;
                     this.field3262 = -this.field3262;
                  } while(--this.field3267 != 0);
               }
            } else {
               label155: {
                  int var7;
                  if(this.field3262 < 0) {
                     if(this.field3271 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field3271) / var6;
                     if(var7 >= this.field3267) {
                        this.field3271 += var6 * this.field3267;
                        this.field3267 = 0;
                        break label155;
                     }

                     this.field3271 += var6 * var7;
                     this.field3267 -= var7;
                  } else {
                     if(this.field3271 < var4) {
                        return;
                     }

                     var7 = (this.field3271 - var3) / var6;
                     if(var7 >= this.field3267) {
                        this.field3271 -= var6 * this.field3267;
                        this.field3267 = 0;
                        break label155;
                     }

                     this.field3271 -= var6 * var7;
                     this.field3267 -= var7;
                  }

                  return;
               }
            }
         }

         if(this.field3262 < 0) {
            if(this.field3271 < 0) {
               this.field3271 = -1;
               this.method4780();
               this.method3937();
            }
         } else if(this.field3271 >= var5) {
            this.field3271 = var5;
            this.method4780();
            this.method3937();
         }

      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class309 vmethod6059() {
      return null;
   }

   @ObfuscatedName("an")
   int method4793(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.field3264 > 0) {
            int var6 = var2 + this.field3264;
            if(var6 > var4) {
               var6 = var4;
            }

            this.field3264 += var2;
            if(this.field3262 == 256 && (this.field3271 & 255) == 0) {
               if(class268.field3462) {
                  var2 = method4805(0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3265, this.field3266, this.field3273, this.field3274, 0, var6, var3, this);
               } else {
                  var2 = method4867(((class33)super.field3816).field307, var1, this.field3271, var2, this.field3270, this.field3272, 0, var6, var3, this);
               }
            } else if(class268.field3462) {
               var2 = method4809(0, 0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3265, this.field3266, this.field3273, this.field3274, 0, var6, var3, this, this.field3262, var5);
            } else {
               var2 = method4808(0, 0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3270, this.field3272, 0, var6, var3, this, this.field3262, var5);
            }

            this.field3264 -= var2;
            if(this.field3264 != 0) {
               return var2;
            }

            if(!this.method4795()) {
               continue;
            }

            return var4;
         }

         if(this.field3262 == 256 && (this.field3271 & 255) == 0) {
            if(class268.field3462) {
               return method4797(0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3265, this.field3266, 0, var4, var3, this);
            }

            return method4791(((class33)super.field3816).field307, var1, this.field3271, var2, this.field3270, 0, var4, var3, this);
         }

         if(class268.field3462) {
            return method4801(0, 0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3265, this.field3266, 0, var4, var3, this, this.field3262, var5);
         }

         return method4800(0, 0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3270, 0, var4, var3, this, this.field3262, var5);
      }
   }

   @ObfuscatedName("i")
   public synchronized void method4778(int var1) {
      int var2 = ((class33)super.field3816).field307.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.field3271 = var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "()Ldm;"
   )
   protected class309 vmethod6056() {
      return null;
   }

   @ObfuscatedName("r")
   protected int vmethod6057() {
      return this.field3268 == 0 && this.field3264 == 0?0:1;
   }

   @ObfuscatedName("u")
   public synchronized int method4776() {
      return this.field3268 == Integer.MIN_VALUE?0:this.field3268;
   }

   @ObfuscatedName("ai")
   public boolean method4860() {
      return this.field3264 != 0;
   }

   @ObfuscatedName("m")
   public synchronized void vmethod6060(int[] var1, int var2, int var3) {
      if(this.field3268 == 0 && this.field3264 == 0) {
         this.vmethod6061(var3);
      } else {
         class33 var4 = (class33)super.field3816;
         int var5 = this.field3263 << 8;
         int var6 = this.field3269 << 8;
         int var7 = var4.field307.length << 8;
         int var8 = var6 - var5;
         if(var8 <= 0) {
            this.field3267 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.field3271 < 0) {
            if(this.field3262 <= 0) {
               this.method4780();
               this.method3937();
               return;
            }

            this.field3271 = 0;
         }

         if(this.field3271 >= var7) {
            if(this.field3262 >= 0) {
               this.method4780();
               this.method3937();
               return;
            }

            this.field3271 = var7 - 1;
         }

         if(this.field3267 < 0) {
            if(this.field3261) {
               if(this.field3262 < 0) {
                  var9 = this.method4794(var1, var2, var5, var3, var4.field307[this.field3263]);
                  if(this.field3271 >= var5) {
                     return;
                  }

                  this.field3271 = var5 + var5 - 1 - this.field3271;
                  this.field3262 = -this.field3262;
               }

               while(true) {
                  var9 = this.method4793(var1, var9, var6, var3, var4.field307[this.field3269 - 1]);
                  if(this.field3271 < var6) {
                     return;
                  }

                  this.field3271 = var6 + var6 - 1 - this.field3271;
                  this.field3262 = -this.field3262;
                  var9 = this.method4794(var1, var9, var5, var3, var4.field307[this.field3263]);
                  if(this.field3271 >= var5) {
                     return;
                  }

                  this.field3271 = var5 + var5 - 1 - this.field3271;
                  this.field3262 = -this.field3262;
               }
            } else if(this.field3262 < 0) {
               while(true) {
                  var9 = this.method4794(var1, var9, var5, var3, var4.field307[this.field3269 - 1]);
                  if(this.field3271 >= var5) {
                     return;
                  }

                  this.field3271 = var6 - 1 - (var6 - 1 - this.field3271) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method4793(var1, var9, var6, var3, var4.field307[this.field3263]);
                  if(this.field3271 < var6) {
                     return;
                  }

                  this.field3271 = var5 + (this.field3271 - var5) % var8;
               }
            }
         } else {
            if(this.field3267 > 0) {
               if(this.field3261) {
                  label132: {
                     if(this.field3262 < 0) {
                        var9 = this.method4794(var1, var2, var5, var3, var4.field307[this.field3263]);
                        if(this.field3271 >= var5) {
                           return;
                        }

                        this.field3271 = var5 + var5 - 1 - this.field3271;
                        this.field3262 = -this.field3262;
                        if(--this.field3267 == 0) {
                           break label132;
                        }
                     }

                     do {
                        var9 = this.method4793(var1, var9, var6, var3, var4.field307[this.field3269 - 1]);
                        if(this.field3271 < var6) {
                           return;
                        }

                        this.field3271 = var6 + var6 - 1 - this.field3271;
                        this.field3262 = -this.field3262;
                        if(--this.field3267 == 0) {
                           break;
                        }

                        var9 = this.method4794(var1, var9, var5, var3, var4.field307[this.field3263]);
                        if(this.field3271 >= var5) {
                           return;
                        }

                        this.field3271 = var5 + var5 - 1 - this.field3271;
                        this.field3262 = -this.field3262;
                     } while(--this.field3267 != 0);
                  }
               } else {
                  int var10;
                  if(this.field3262 < 0) {
                     while(true) {
                        var9 = this.method4794(var1, var9, var5, var3, var4.field307[this.field3269 - 1]);
                        if(this.field3271 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field3271) / var8;
                        if(var10 >= this.field3267) {
                           this.field3271 += var8 * this.field3267;
                           this.field3267 = 0;
                           break;
                        }

                        this.field3271 += var8 * var10;
                        this.field3267 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method4793(var1, var9, var6, var3, var4.field307[this.field3263]);
                        if(this.field3271 < var6) {
                           return;
                        }

                        var10 = (this.field3271 - var5) / var8;
                        if(var10 >= this.field3267) {
                           this.field3271 -= var8 * this.field3267;
                           this.field3267 = 0;
                           break;
                        }

                        this.field3271 -= var8 * var10;
                        this.field3267 -= var10;
                     }
                  }
               }
            }

            if(this.field3262 < 0) {
               this.method4794(var1, var9, 0, var3, 0);
               if(this.field3271 < 0) {
                  this.field3271 = -1;
                  this.method4780();
                  this.method3937();
               }
            } else {
               this.method4793(var1, var9, var7, var3, 0);
               if(this.field3271 >= var7) {
                  this.field3271 = var7;
                  this.method4780();
                  this.method3937();
               }
            }

         }
      }
   }

   @ObfuscatedName("y")
   public synchronized void method4781(int var1, int var2) {
      this.method4863(var1, var2, this.method4875());
   }

   @ObfuscatedName("ak")
   boolean method4795() {
      int var1 = this.field3268;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method4837(var1, this.field3260);
         var3 = method4767(var1, this.field3260);
      }

      if(var1 == this.field3270 && var2 == this.field3265 && var3 == this.field3266) {
         if(this.field3268 == Integer.MIN_VALUE) {
            this.field3268 = 0;
            this.field3266 = 0;
            this.field3265 = 0;
            this.field3270 = 0;
            this.method3937();
            return true;
         } else {
            this.method4920();
            return false;
         }
      } else {
         if(this.field3270 < var1) {
            this.field3272 = 1;
            this.field3264 = var1 - this.field3270;
         } else if(this.field3270 > var1) {
            this.field3272 = -1;
            this.field3264 = this.field3270 - var1;
         } else {
            this.field3272 = 0;
         }

         if(this.field3265 < var2) {
            this.field3273 = 1;
            if(this.field3264 == 0 || this.field3264 > var2 - this.field3265) {
               this.field3264 = var2 - this.field3265;
            }
         } else if(this.field3265 > var2) {
            this.field3273 = -1;
            if(this.field3264 == 0 || this.field3264 > this.field3265 - var2) {
               this.field3264 = this.field3265 - var2;
            }
         } else {
            this.field3273 = 0;
         }

         if(this.field3266 < var3) {
            this.field3274 = 1;
            if(this.field3264 == 0 || this.field3264 > var3 - this.field3266) {
               this.field3264 = var3 - this.field3266;
            }
         } else if(this.field3266 > var3) {
            this.field3274 = -1;
            if(this.field3264 == 0 || this.field3264 > this.field3266 - var3) {
               this.field3264 = this.field3266 - var3;
            }
         } else {
            this.field3274 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("x")
   public synchronized void method4773(int var1) {
      this.method4895(var1 << 6, this.method4875());
   }

   @ObfuscatedName("v")
   synchronized void method4774(int var1) {
      this.method4895(var1, this.method4875());
   }

   @ObfuscatedName("ay")
   int method4794(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.field3264 > 0) {
            int var6 = var2 + this.field3264;
            if(var6 > var4) {
               var6 = var4;
            }

            this.field3264 += var2;
            if(this.field3262 == -256 && (this.field3271 & 255) == 0) {
               if(class268.field3462) {
                  var2 = method4807(0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3265, this.field3266, this.field3273, this.field3274, 0, var6, var3, this);
               } else {
                  var2 = method4806(((class33)super.field3816).field307, var1, this.field3271, var2, this.field3270, this.field3272, 0, var6, var3, this);
               }
            } else if(class268.field3462) {
               var2 = method4835(0, 0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3265, this.field3266, this.field3273, this.field3274, 0, var6, var3, this, this.field3262, var5);
            } else {
               var2 = method4810(0, 0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3270, this.field3272, 0, var6, var3, this, this.field3262, var5);
            }

            this.field3264 -= var2;
            if(this.field3264 != 0) {
               return var2;
            }

            if(!this.method4795()) {
               continue;
            }

            return var4;
         }

         if(this.field3262 == -256 && (this.field3271 & 255) == 0) {
            if(class268.field3462) {
               return method4799(0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3265, this.field3266, 0, var4, var3, this);
            }

            return method4798(((class33)super.field3816).field307, var1, this.field3271, var2, this.field3270, 0, var4, var3, this);
         }

         if(class268.field3462) {
            return method4803(0, 0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3265, this.field3266, 0, var4, var3, this, this.field3262, var5);
         }

         return method4802(0, 0, ((class33)super.field3816).field307, var1, this.field3271, var2, this.field3270, 0, var4, var3, this, this.field3262, var5);
      }
   }

   @ObfuscatedName("av")
   public synchronized void method4863(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method4895(var2, var3);
      } else {
         int var4 = method4837(var2, var3);
         int var5 = method4767(var2, var3);
         if(var4 == this.field3265 && var5 == this.field3266) {
            this.field3264 = 0;
         } else {
            int var6 = var2 - this.field3270;
            if(this.field3270 - var2 > var6) {
               var6 = this.field3270 - var2;
            }

            if(var4 - this.field3265 > var6) {
               var6 = var4 - this.field3265;
            }

            if(this.field3265 - var4 > var6) {
               var6 = this.field3265 - var4;
            }

            if(var5 - this.field3266 > var6) {
               var6 = var5 - this.field3266;
            }

            if(this.field3266 - var5 > var6) {
               var6 = this.field3266 - var5;
            }

            if(var1 > var6) {
               var1 = var6;
            }

            this.field3264 = var1;
            this.field3268 = var2;
            this.field3260 = var3;
            this.field3272 = (var2 - this.field3270) / var1;
            this.field3273 = (var4 - this.field3265) / var1;
            this.field3274 = (var5 - this.field3266) / var1;
         }
      }
   }

   @ObfuscatedName("ae")
   public synchronized void method4783(int var1) {
      if(var1 == 0) {
         this.method4774(0);
         this.method3937();
      } else if(this.field3265 == 0 && this.field3266 == 0) {
         this.field3264 = 0;
         this.field3268 = 0;
         this.field3270 = 0;
         this.method3937();
      } else {
         int var2 = -this.field3270;
         if(this.field3270 > var2) {
            var2 = this.field3270;
         }

         if(-this.field3265 > var2) {
            var2 = -this.field3265;
         }

         if(this.field3265 > var2) {
            var2 = this.field3265;
         }

         if(-this.field3266 > var2) {
            var2 = -this.field3266;
         }

         if(this.field3266 > var2) {
            var2 = this.field3266;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.field3264 = var1;
         this.field3268 = Integer.MIN_VALUE;
         this.field3272 = -this.field3270 / var1;
         this.field3273 = -this.field3265 / var1;
         this.field3274 = -this.field3266 / var1;
      }
   }

   @ObfuscatedName("d")
   public synchronized void method4772(int var1) {
      this.field3267 = var1;
   }

   @ObfuscatedName("o")
   public synchronized int method4875() {
      return this.field3260 < 0?-1:this.field3260;
   }

   @ObfuscatedName("g")
   synchronized void method4895(int var1, int var2) {
      this.field3268 = var1;
      this.field3260 = var2;
      this.field3264 = 0;
      this.method4920();
   }

   @ObfuscatedName("ap")
   public synchronized void method4784(int var1) {
      if(this.field3262 < 0) {
         this.field3262 = -var1;
      } else {
         this.field3262 = var1;
      }

   }

   @ObfuscatedName("q")
   void method4780() {
      if(this.field3264 != 0) {
         if(this.field3268 == Integer.MIN_VALUE) {
            this.field3268 = 0;
         }

         this.field3264 = 0;
         this.method4920();
      }

   }

   @ObfuscatedName("ah")
   int vmethod6079() {
      int var1 = this.field3270 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.field3267 == 0) {
         var1 -= var1 * this.field3271 / (((class33)super.field3816).field307.length << 8);
      } else if(this.field3267 >= 0) {
         var1 -= var1 * this.field3263 / ((class33)super.field3816).field307.length;
      }

      return var1 > 255?255:var1;
   }

   @ObfuscatedName("e")
   void method4920() {
      this.field3270 = this.field3268;
      this.field3265 = method4837(this.field3268, this.field3260);
      this.field3266 = method4767(this.field3268, this.field3260);
   }

   @ObfuscatedName("au")
   public synchronized int method4785() {
      return this.field3262 < 0?-this.field3262:this.field3262;
   }

   @ObfuscatedName("aj")
   public boolean method4786() {
      return this.field3271 < 0 || this.field3271 >= ((class33)super.field3816).field307.length << 8;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIIIILdl;II)I"
   )
   static int method4835(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class243 var13, int var14, int var15) {
      var13.field3270 -= var5 * var13.field3272;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field3270 += var13.field3272 * var5;
      var13.field3265 = var6;
      var13.field3266 = var7;
      var13.field3271 = var4;
      return var5;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIIIILdl;II)I"
   )
   static int method4809(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class243 var13, int var14, int var15) {
      var13.field3270 -= var5 * var13.field3272;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field3270 += var13.field3272 * var5;
      var13.field3265 = var6;
      var13.field3266 = var7;
      var13.field3271 = var4;
      return var5;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIIIILdl;)I"
   )
   static int method4807(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class243 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field3270 += var12.field3272 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field3265 = var5 >> 2;
      var12.field3266 = var6 >> 2;
      var12.field3271 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdl;II)I"
   )
   static int method4810(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class243 var11, int var12, int var13) {
      var11.field3265 -= var11.field3273 * var5;
      var11.field3266 -= var11.field3274 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field3265 += var11.field3273 * var5;
      var11.field3266 += var11.field3274 * var5;
      var11.field3270 = var6;
      var11.field3271 = var4;
      return var5;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdl;II)I"
   )
   static int method4808(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class243 var11, int var12, int var13) {
      var11.field3265 -= var11.field3273 * var5;
      var11.field3266 -= var11.field3274 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field3265 += var11.field3273 * var5;
      var11.field3266 += var11.field3274 * var5;
      var11.field3270 = var6;
      var11.field3271 = var4;
      return var5;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIILdl;)I"
   )
   static int method4799(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class243 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var3 + var4 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field3271 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIILdl;)I"
   )
   static int method4797(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class243 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field3271 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("l")
   static int method4767(int var0, int var1) {
      return var1 < 0?-var0:(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lcr;III)Ldl;"
   )
   public static class243 method4771(class33 var0, int var1, int var2, int var3) {
      return var0.field307 != null && var0.field307.length != 0?new class243(var0, var1, var2, var3):null;
   }

   @ObfuscatedName("f")
   static int method4837(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIILdl;)I"
   )
   static int method4791(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class243 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field3271 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdl;II)I"
   )
   static int method4801(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class243 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field3271 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIIIILdl;)I"
   )
   static int method4805(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class243 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field3270 += var12.field3272 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field3265 = var5 >> 2;
      var12.field3266 = var6 >> 2;
      var12.field3271 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdl;II)I"
   )
   static int method4803(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class243 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field3271 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIILdl;)I"
   )
   static int method4798(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class243 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field3271 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIIILdl;)I"
   )
   static int method4867(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class243 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field3265 += var9.field3273 * (var6 - var3);
      var9.field3266 += var9.field3274 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field3270 = var4 >> 2;
      var9.field3271 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIIILdl;)I"
   )
   static int method4806(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class243 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field3265 += var9.field3273 * (var6 - var3);
      var9.field3266 += var9.field3274 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field3270 = var4 >> 2;
      var9.field3271 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIILdl;II)I"
   )
   static int method4802(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class243 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field3271 = var4;
      return var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lcr;II)Ldl;"
   )
   public static class243 method4769(class33 var0, int var1, int var2) {
      return var0.field307 != null && var0.field307.length != 0?new class243(var0, (int)((long)var0.field310 * 256L * (long)var1 / (long)(class293.field3657 * 100)), var2 << 6):null;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIILdl;II)I"
   )
   static int method4800(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class243 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field3271 = var4;
      return var5;
   }
}
