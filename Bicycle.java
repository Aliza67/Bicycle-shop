/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

public class Bicycle implements Comparable<Bicycle>{
        
     private int cadence;
     private int gear;
     private int speed;
     private int price;
         
     public Bicycle() {
          gear = 2;
          cadence = 0;
          speed = 0;
          price = 0;
      }

     public Bicycle(int startCadence, int startSpeed, int price) {
          gear = 2;
          cadence = startCadence;
          speed = startSpeed;
          this.price = price;
      }
     public Bicycle(int startCadence, int startSpeed, int startGear, int price) {
         gear = startGear;
         cadence = startCadence;
         speed = startSpeed;
         this.price = price;
     }
         
     
     public int getPrice() {
          return price;
     }

     public void setPrice(int price) {
          this.price = price;
     }

     public int getCadence() {
         return cadence;
     }
         
     public void setCadence(int newValue) {
         cadence = newValue;
     }
         
     public int getGear() {
         return gear;
     }
         
     public void setGear(int newValue) {
         gear = newValue;
     }
         
     public int getSpeed() {
         return speed;
     }
         
     public void applyBrake(int decrement) {
         speed -= decrement;
     }
         
     public void speedUp(int increment) {
         speed += increment;
     }

     @Override
     public String toString() {
          return "Bicycle [cadence=" + cadence + ", gear=" + gear + ", price=" + price + ", speed=" + speed + "]";
     }

     @Override
     public int compareTo(Bicycle o) {
          if (this.price>o.getPrice()) {
               return -1;
          }
          else if (this.price==o.getPrice()) {
               return 0;
          }
          else {
               return 1;
          }
     }

     
 }

