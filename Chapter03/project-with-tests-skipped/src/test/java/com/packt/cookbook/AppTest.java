package com.packt.cookbook;
 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class AppTest {
 
 @BeforeClass
 public void setUp() {
   System.out.println("Set up run");
 }
 
 @Test(groups = { "fast" })
 public void aFastTest() {
   System.out.println("Fast test");
 }
 
 @Test(groups = { "slow" })
 public void aSlowTest() {
    System.out.println("Slow test");
 }
 
}

