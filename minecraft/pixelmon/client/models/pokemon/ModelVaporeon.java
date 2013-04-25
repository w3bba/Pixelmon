// Date: 4/25/2013 5:56:55 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.quadruped.SkeletonQuadruped;

public class ModelVaporeon extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
    
  public ModelVaporeon()
  {
    textureWidth = 128;
    textureHeight = 64;
    
    Body = new PixelmonModelRenderer(this, "Body");
    Body.setRotationPoint(0, 12, 0);
    PixelmonModelRenderer  body_1 = new PixelmonModelRenderer(this, 0, 21);
    body_1.addBox(-3F, -2F, -5F, 6, 7, 4);
    body_1.setTextureSize(128, 64);
    body_1.mirror = true;
    setRotation(body_1, -0.0523599F, 0F, 0F);
    PixelmonModelRenderer  body_2 = new PixelmonModelRenderer(this, 0, 20);
    body_2.addBox(-3F, -2F, -2F, 6, 6, 7);
    body_2.setTextureSize(128, 64);
    body_2.mirror = true;
    setRotation(body_2, 0.0698132F, 0F, 0F);
    PixelmonModelRenderer  belly = new PixelmonModelRenderer(this, 0, 24);
    belly.addBox(-3F, 2.333333F, -2.4F, 6, 2, 6);
    belly.setTextureSize(128, 64);
    belly.mirror = true;
    setRotation(belly, 0.2617994F, 0F, 0F);
    PixelmonModelRenderer  booty = new PixelmonModelRenderer(this, 0, 23);
    booty.addBox(-3F, -1.133333F, 2.333333F, 6, 6, 3);
    booty.setTextureSize(128, 64);
    booty.mirror = true;
    setRotation(booty, 0.2268928F, 0F, 0F);
    PixelmonModelRenderer  neck_1 = new PixelmonModelRenderer(this, 0, 22);
    neck_1.addBox(-2F, 3.666667F, -6.6F, 4, 3, 4);
    neck_1.setTextureSize(128, 64);
    neck_1.mirror = true;
    setRotation(neck_1, -1.012291F, 0F, 0F);
    PixelmonModelRenderer  chest = new PixelmonModelRenderer(this, 0, 22);
    chest.addBox(-3F, 0.5333334F, -6.066667F, 6, 6, 4);
    chest.setTextureSize(128, 64);
    chest.mirror = true;
    setRotation(chest, -0.5061455F, 0F, 0F);
    PixelmonModelRenderer  neck_2 = new PixelmonModelRenderer(this, 0, 24);
    neck_2.addBox(-2F, 5.533333F, -6.066667F, 4, 3, 5);
    neck_2.setTextureSize(128, 64);
    neck_2.mirror = true;
    setRotation(neck_2, -1.186824F, 0F, 0F);
    PixelmonModelRenderer  neck_L = new PixelmonModelRenderer(this, 0, 25);
    neck_L.addBox(2F, 3.3F, -6.7F, 2, 3, 4);
    neck_L.setTextureSize(128, 64);
    neck_L.mirror = true;
    setRotation(neck_L, -0.9424778F, 0.2094395F, -0.0174533F);
    PixelmonModelRenderer  neck_R = new PixelmonModelRenderer(this, 0, 25);
    neck_R.addBox(-4F, 3.266667F, -6.733333F, 2, 3, 4);
    neck_R.setTextureSize(128, 64);
    neck_R.mirror = true;
    setRotation(neck_R, -0.9424778F, -0.2094395F, 0.0174533F);
    
    
    PixelmonModelRenderer BLLeg = new PixelmonModelRenderer(this, "Back Left Leg");
    BLLeg.setRotationPoint(3, 0, 4);
    PixelmonModelRenderer  leg_1_L = new PixelmonModelRenderer(this, 0, 22);
    leg_1_L.addBox(-1F, -1F, -2.866667F, 2, 6, 4);
    leg_1_L.setTextureSize(128, 64);
    leg_1_L.mirror = true;
    setRotation(leg_1_L, 0.3490659F, 0.122173F, 0F);
    PixelmonModelRenderer  leg_2_L = new PixelmonModelRenderer(this, 0, 27);
    leg_2_L.addBox(-1F, 2.466667F, -5.233333F, 2, 3, 2);
    leg_2_L.setTextureSize(128, 64);
    leg_2_L.mirror = true;
    setRotation(leg_2_L, 0.9773844F, 0.122173F, 0F);
    PixelmonModelRenderer  leg_3_L = new PixelmonModelRenderer(this, 0, 28);
    leg_3_L.addBox(-1F, 4.8F, -1.5F, 2, 2, 2);
    leg_3_L.setTextureSize(128, 64);
    leg_3_L.mirror = true;
    setRotation(leg_3_L, 0.418879F, 0.122173F, 0F);
    PixelmonModelRenderer  leg_4_L = new PixelmonModelRenderer(this, 0, 34);
    leg_4_L.addBox(-1F, 5.533333F, 3.133333F, 2, 6, 1);
    leg_4_L.setTextureSize(128, 64);
    leg_4_L.mirror = true;
    setRotation(leg_4_L, -0.1570796F, 0.0872665F, 0F);
    PixelmonModelRenderer  leg_5_L = new PixelmonModelRenderer(this, 0, 34);
    leg_5_L.addBox(-1F, 5.866667F, 1.933333F, 2, 6, 1);
    leg_5_L.setTextureSize(128, 64);
    leg_5_L.mirror = true;
    setRotation(leg_5_L, -0.0872665F, 0.0872665F, 0F);
    PixelmonModelRenderer  paw_back_L = new PixelmonModelRenderer(this, 7, 37);
    paw_back_L.addBox(-1F, 10F, -0.06666667F, 2, 2, 2);
    paw_back_L.setTextureSize(128, 64);
    paw_back_L.mirror = true;
    setRotation(paw_back_L, 0F, 0.0872665F, 0F);
    
    
    PixelmonModelRenderer BRLeg = new PixelmonModelRenderer(this, "Back Right Leg");
    BRLeg.setRotationPoint(-3, 0, 4);
    PixelmonModelRenderer leg_1_R = new PixelmonModelRenderer(this, 0, 22);
    leg_1_R.addBox(-1F, -1F, -2.866667F, 2, 6, 4);
    leg_1_R.setTextureSize(128, 64);
    leg_1_R.mirror = true;
    setRotation(leg_1_R, 0.3490659F, -0.122173F, 0F);
    PixelmonModelRenderer leg_2_R = new PixelmonModelRenderer(this, 0, 27);
    leg_2_R.addBox(-1F, 2.466667F, -5.233333F, 2, 3, 2);
    leg_2_R.setTextureSize(128, 64);
    leg_2_R.mirror = true;
    setRotation(leg_2_R, 0.9773844F, -0.122173F, 0F);
    PixelmonModelRenderer leg_3_R = new PixelmonModelRenderer(this, 0, 28);
    leg_3_R.addBox(-1F, 4.8F, -1.5F, 2, 2, 2);
    leg_3_R.setTextureSize(128, 64);
    leg_3_R.mirror = true;
    setRotation(leg_3_R, 0.418879F, -0.122173F, 0F);
    PixelmonModelRenderer leg_4_R = new PixelmonModelRenderer(this, 0, 34);
    leg_4_R.addBox(-1F, 5.533333F, 3.133333F, 2, 6, 1);
    leg_4_R.setTextureSize(128, 64);
    leg_4_R.mirror = true;
    setRotation(leg_4_R, -0.1570796F, -0.0872665F, 0F);
    PixelmonModelRenderer leg_5_R = new PixelmonModelRenderer(this, 0, 34);
    leg_5_R.addBox(-1F, 5.866667F, 1.933333F, 2, 6, 1);
    leg_5_R.setTextureSize(128, 64);
    leg_5_R.mirror = true;
    setRotation(leg_5_R, -0.0872665F, -0.0872665F, 0F);
    PixelmonModelRenderer paw_back_R = new PixelmonModelRenderer(this, 7, 37);
    paw_back_R.addBox(-1F, 10F, -0.06666667F, 2, 2, 2);
    paw_back_R.setTextureSize(128, 64);
    paw_back_R.mirror = true;
    setRotation(paw_back_R, 0F, -0.0872665F, 0F);
    
    
    
    PixelmonModelRenderer FLLeg = new PixelmonModelRenderer(this, "Front Left Leg");
    FLLeg.setRotationPoint(3, 1, -5);
    PixelmonModelRenderer  front_leg_1_L = new PixelmonModelRenderer(this, 0, 22);
    front_leg_1_L.addBox(-1F, -1F, -1F, 2, 7, 3);
    front_leg_1_L.setTextureSize(128, 64);
    front_leg_1_L.mirror = true;
    setRotation(front_leg_1_L, 0.0698132F, 0F, 0F);
    PixelmonModelRenderer  front_leg_2_L = new PixelmonModelRenderer(this, 0, 34);
    front_leg_2_L.addBox(-1F, 4.733333F, 1.866667F, 2, 6, 1);
    front_leg_2_L.setTextureSize(128, 64);
    front_leg_2_L.mirror = true;
    setRotation(front_leg_2_L, -0.1745329F, 0F, 0F);
    PixelmonModelRenderer  front_leg_3_L = new PixelmonModelRenderer(this, 0, 34);
    front_leg_3_L.addBox(-1F, 5F, 0.2666667F, 2, 6, 1);
    front_leg_3_L.setTextureSize(128, 64);
    front_leg_3_L.mirror = true;
    setRotation(front_leg_3_L, -0.0698132F, 0F, 0F);
    PixelmonModelRenderer  paw_frontL = new PixelmonModelRenderer(this, 7, 37);
    paw_frontL.addBox(-1F, 9F, -1.466667F, 2, 2, 2);
    paw_frontL.setTextureSize(128, 64);
    paw_frontL.mirror = true;
    setRotation(paw_frontL, 0F, 0F, 0F);
    
    
    PixelmonModelRenderer FRLeg = new PixelmonModelRenderer(this, "Front Right Leg");
    FRLeg.setRotationPoint(-3, 1, -5);
    PixelmonModelRenderer front_leg_1_R = new PixelmonModelRenderer(this, 0, 22);
    front_leg_1_R.addBox(-1F, -1F, -1F, 2, 7, 3);
    front_leg_1_R.setTextureSize(128, 64);
    front_leg_1_R.mirror = true;
    setRotation(front_leg_1_R, 0.0698132F, 0F, 0F);
    PixelmonModelRenderer front_leg_2_R = new PixelmonModelRenderer(this, 0, 34);
    front_leg_2_R.addBox(-1F, 4.7F, 1.866667F, 2, 6, 1);
    front_leg_2_R.setTextureSize(128, 64);
    front_leg_2_R.mirror = true;
    setRotation(front_leg_2_R, -0.1745329F, 0F, 0F);
    PixelmonModelRenderer front_leg_3_R = new PixelmonModelRenderer(this, 0, 34);
    front_leg_3_R.addBox(-1F, 5F, 0.2666667F, 2, 6, 1);
    front_leg_3_R.setTextureSize(128, 64);
    front_leg_3_R.mirror = true;
    setRotation(front_leg_3_R, -0.0698132F, 0F, 0F);
    PixelmonModelRenderer paw_frontR = new PixelmonModelRenderer(this, 7, 37);
    paw_frontR.addBox(-1F, 9F, -1.466667F, 2, 2, 2);
    paw_frontR.setTextureSize(128, 64);
    paw_frontR.mirror = true;
    setRotation(paw_frontR, 0F, 0F, 0F);
    
    
    PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
    Head.setRotationPoint( 0, -3, -8);
    PixelmonModelRenderer  head_main = new PixelmonModelRenderer(this, 0, 21);
    head_main.addBox(-1.5F, -3.866667F, -3F, 3, 5, 5);
    head_main.setTextureSize(128, 64);
    head_main.mirror = true;
    setRotation(head_main, 0.0523599F, 0F, 0F);
    PixelmonModelRenderer  snout = new PixelmonModelRenderer(this, 16, 33);
    snout.addBox(-1.5F, -2.933333F, -4.266667F, 3, 2, 2);
    snout.setTextureSize(128, 64);
    snout.mirror = true;
    setRotation(snout, 0.6108652F, 0F, 0F);
    PixelmonModelRenderer  head_L = new PixelmonModelRenderer(this, 0, 42);
    head_L.addBox(-0.4F, -4F, -2.266667F, 4, 5, 4);
    head_L.setTextureSize(128, 64);
    head_L.mirror = true;
    setRotation(head_L, 0.0523599F, 0.6632251F, 0.0349066F);
    PixelmonModelRenderer  head_R = new PixelmonModelRenderer(this, 0, 42);
    head_R.addBox(-3.6F, -4F, -2.266667F, 4, 5, 4);
    head_R.setTextureSize(128, 64);
    head_R.mirror = true;
    setRotation(head_R, 0.0523599F, -0.6632251F, -0.0349066F);
    PixelmonModelRenderer  forhead = new PixelmonModelRenderer(this, 0, 24);
    forhead.addBox(-1.5F, -3.8F, -4.133333F, 3, 5, 2);
    forhead.setTextureSize(128, 64);
    forhead.mirror = true;
    setRotation(forhead, -0.2094395F, 0F, 0F);
    PixelmonModelRenderer  head_backL = new PixelmonModelRenderer(this, 0, 24);
    head_backL.addBox(-0.6666667F, -3.866667F, 1.333333F, 3, 5, 2);
    head_backL.setTextureSize(128, 64);
    head_backL.mirror = true;
    setRotation(head_backL, 0.0523599F, 1.169371F, 0.0523599F);
    PixelmonModelRenderer  head_backR = new PixelmonModelRenderer(this, 0, 24);
    head_backR.addBox(-2.3F, -3.866667F, 1.333333F, 3, 5, 2);
    head_backR.setTextureSize(128, 64);
    head_backR.mirror = true;
    setRotation(head_backR, 0.0523599F, -1.169371F, -0.0523599F);
    PixelmonModelRenderer  head_back = new PixelmonModelRenderer(this, 0, 23);
    head_back.addBox(-2.5F, -3.866667F, -1F, 5, 5, 3);
    head_back.setTextureSize(128, 64);
    head_back.mirror = true;
    setRotation(head_back, 0.0698132F, 0F, 0F);
    PixelmonModelRenderer  head_top_L = new PixelmonModelRenderer(this, 0, 25);
    head_top_L.addBox(0.3F, -4.866667F, -2.266667F, 2, 1, 4);
    head_top_L.setTextureSize(128, 64);
    head_top_L.mirror = true;
    setRotation(head_top_L, 0.0523599F, 0.296706F, 0.1047198F);
    PixelmonModelRenderer  head_top_R = new PixelmonModelRenderer(this, 0, 24);
    head_top_R.addBox(-2.3F, -4.866667F, -2.266667F, 2, 1, 4);
    head_top_R.setTextureSize(128, 64);
    head_top_R.mirror = true;
    setRotation(head_top_R, 0.0523599F, -0.296706F, -0.1047198F);
    PixelmonModelRenderer  ear_1_L = new PixelmonModelRenderer(this, 44, 35);
    ear_1_L.addBox(1.533333F, -15.53333F, -3.8F, 1, 12, 7);
    ear_1_L.setTextureSize(128, 64);
    ear_1_L.mirror = true;
    setRotation(ear_1_L, -0.418879F, 1.012291F, 0.1047198F);
    PixelmonModelRenderer  ear_1_R = new PixelmonModelRenderer(this, 44, 35);
    ear_1_R.addBox(-3.466667F, -15.53333F, -3.8F, 1, 12, 7);
    ear_1_R.setTextureSize(128, 64);
    ear_1_R.mirror = true;
    setRotation(ear_1_R, -0.418879F, -1.012291F, -0.1047198F);
    PixelmonModelRenderer  forhead_2 = new PixelmonModelRenderer(this, 0, 24);
    forhead_2.addBox(-1.5F, -3.2F, -4.6F, 3, 4, 2);
    forhead_2.setTextureSize(128, 64);
    forhead_2.mirror = true;
    setRotation(forhead_2, -0.122173F, 0F, 0F);
    PixelmonModelRenderer  snout_bottom = new PixelmonModelRenderer(this, 16, 33);
    snout_bottom.addBox(-1.5F, -0.3333333F, -3.8F, 3, 2, 2);
    snout_bottom.setTextureSize(128, 64);
    snout_bottom.mirror = true;
    setRotation(snout_bottom, -0.0174533F, 0F, 0F);
    PixelmonModelRenderer  head_top = new PixelmonModelRenderer(this, 0, 21);
    head_top.addBox(-1.5F, -4.866667F, -2.533333F, 3, 5, 4);
    head_top.setTextureSize(128, 64);
    head_top.mirror = true;
    setRotation(head_top, 0.0523599F, 0F, 0F);
    Body.addChild(body_1);
    Body.addChild(body_2);
    Body.addChild(belly);
    Body.addChild(booty);
    Body.addChild(neck_1);
    Body.addChild(chest);
    Body.addChild(neck_2);
    Body.addChild(neck_L);
    Body.addChild(neck_R);
    BLLeg.addChild(leg_1_L);
    BLLeg.addChild(leg_2_L);
    BLLeg.addChild(leg_3_L);
    BLLeg.addChild(leg_4_L);
    BLLeg.addChild(leg_5_L);
    BRLeg.addChild(leg_1_R);
    BRLeg.addChild(leg_2_R);
    BRLeg.addChild(leg_3_R);
    BRLeg.addChild(leg_4_R);
    BRLeg.addChild(leg_5_R);
    BLLeg.addChild(paw_back_L);
    BRLeg.addChild(paw_back_R);
    FLLeg.addChild(front_leg_1_L);
    FLLeg.addChild(front_leg_2_L);
    FLLeg.addChild(front_leg_3_L);
    FRLeg.addChild(front_leg_1_R);
    FRLeg.addChild(front_leg_2_R);
    FRLeg.addChild(front_leg_3_R);
    FLLeg.addChild(paw_frontL);
    FRLeg.addChild(paw_frontR);
    Head.addChild(head_main);
    Head.addChild(snout);
    Head.addChild(head_L);
    Head.addChild(head_R);
    Head.addChild(forhead);
    Head.addChild(head_backL);
    Head.addChild(head_backR);
    Head.addChild(head_back);
    Head.addChild(head_top_L);
    Head.addChild(head_top_R);
    Head.addChild(ear_1_L);
    Head.addChild(ear_1_R);
    Head.addChild(forhead_2);
    Head.addChild(snout_bottom);
    Head.addChild(head_top);
    Body.addChild(Head);
    Body.addChild(FLLeg);
    Body.addChild(FRLeg);
    Body.addChild(BLLeg);
    Body.addChild(BRLeg);
    
    
    
      PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
      Tail.setRotationPoint(0, -1, 5);
      PixelmonModelRenderer  tail_1 = new PixelmonModelRenderer(this, 0, 23);
      tail_1.addBox(-2.5F, -1.066667F, -0.4666667F, 5, 5, 4);
      tail_1.setTextureSize(128, 64);
      tail_1.mirror = true;
      setRotation(tail_1, -0.2443461F, 0F, 0F);
      PixelmonModelRenderer  tail_2_ = new PixelmonModelRenderer(this, 0, 21);
      tail_2_.addBox(-2F, -2.066667F, -0.4666667F, 4, 4, 6);
      tail_2_.setRotationPoint(0F, 2F, 3F);
      tail_2_.setTextureSize(128, 64);
      tail_2_.mirror = true;
      setRotation(tail_2_, -0.4712389F, 0F, 0F);
      PixelmonModelRenderer  tail_3 = new PixelmonModelRenderer(this, 0, 21);
      tail_3.addBox(-1.5F, -1.133333F, -0.4666667F, 3, 3, 7);
      tail_3.setRotationPoint(0F, 4F, 8F);
      tail_3.setTextureSize(128, 64);
      tail_3.mirror = true;
      setRotation(tail_3, -0.6981317F, 0F, 0F);
      PixelmonModelRenderer  tail_4 = new PixelmonModelRenderer(this, 0, 21);
      tail_4.addBox(-1F, -0.6666667F, -0.4666667F, 2, 2, 7);
      tail_4.setRotationPoint(0F, 8F, 13F);
      tail_4.setTextureSize(128, 64);
      tail_4.mirror = true;
      setRotation(tail_4, -0.4537856F, 0F, 0F);
      PixelmonModelRenderer  tail_5 = new PixelmonModelRenderer(this, 0, 21);
      tail_5.addBox(-0.5F, -0.6666667F, -0.7333333F, 1, 1, 5);
      tail_5.setRotationPoint(0F, 11F, 19F);
      tail_5.setTextureSize(128, 64);
      tail_5.mirror = true;
      setRotation(tail_5, -0.2443461F, 0F, 0F);
      PixelmonModelRenderer  tail_1_ridge = new PixelmonModelRenderer(this, 44, 57);
      tail_1_ridge.addBox(-1F, -2.733333F, -0.4666667F, 1, 3, 4);
      tail_1_ridge.setTextureSize(128, 64);
      tail_1_ridge.mirror = true;
      setRotation(tail_1_ridge, -0.2443461F, 0F, 0F);
      PixelmonModelRenderer  tail_2_ridge = new PixelmonModelRenderer(this, 30, 55);
      tail_2_ridge.addBox(-1F, -3.733333F, -0.4666667F, 1, 3, 6);
      tail_2_ridge.setRotationPoint(0F, 2F, 3F);
      tail_2_ridge.setTextureSize(128, 64);
      tail_2_ridge.mirror = true;
      setRotation(tail_2_ridge, -0.4712389F, 0F, 0F);
      PixelmonModelRenderer  tail_3_ridge = new PixelmonModelRenderer(this, 66, 38);
      tail_3_ridge.addBox(-1F, -3.2F, -0.4666667F, 1, 3, 7);
      tail_3_ridge.setRotationPoint(0F, 4F, 8F);
      tail_3_ridge.setTextureSize(128, 64);
      tail_3_ridge.mirror = true;
      setRotation(tail_3_ridge, -0.6981317F, 0F, 0F);
      PixelmonModelRenderer  tail_4_ridge = new PixelmonModelRenderer(this, 69, 27);
      tail_4_ridge.addBox(-1F, -2.866667F, -0.4666667F, 1, 3, 7);
      tail_4_ridge.setRotationPoint(0F, 8F, 13F);
      tail_4_ridge.setTextureSize(128, 64);
      tail_4_ridge.mirror = true;
      setRotation(tail_4_ridge, -0.4537856F, 0F, 0F);
      PixelmonModelRenderer  tail_5_ridge = new PixelmonModelRenderer(this, 72, 19);
      tail_5_ridge.addBox(-1F, -2.2F, -0.7333333F, 1, 2, 5);
      tail_5_ridge.setRotationPoint(0F, 11F, 19F);
      tail_5_ridge.setTextureSize(128, 64);
      tail_5_ridge.mirror = true;
      setRotation(tail_5_ridge, -0.2443461F, 0F, 0F);
      PixelmonModelRenderer  tail_fluke = new PixelmonModelRenderer(this, 72, 0);
      tail_fluke.addBox(-8.5F, -0.2F, 2.266667F, 17, 1, 11);
      tail_fluke.setRotationPoint(0F, 11F, 19F);
      tail_fluke.setTextureSize(128, 64);
      tail_fluke.mirror = true;
      setRotation(tail_fluke, -0.1396263F, 0F, 0F);
      Tail.addChild(tail_1);
      Tail.addChild(tail_2_);
      Tail.addChild(tail_3);
      Tail.addChild(tail_4);
      Tail.addChild(tail_5);
      Tail.addChild(tail_fluke);
      Tail.addChild(tail_1_ridge);
      Tail.addChild(tail_2_ridge);
      Tail.addChild(tail_3_ridge);
      Tail.addChild(tail_4_ridge);
      Tail.addChild(tail_5_ridge);
      Body.addChild(Tail);
      
      
      PixelmonModelRenderer body_back_rdge_ = new PixelmonModelRenderer(this, 55, 49);
      body_back_rdge_.addBox(-1F, -3.8F, -5.4F, 1, 4, 11);
      body_back_rdge_.setTextureSize(128, 64);
      body_back_rdge_.mirror = true;
      setRotation(body_back_rdge_, 0F, 0F, 0F);
      Body.addChild(body_back_rdge_);
      
      
      PixelmonModelRenderer  neck_fin = new PixelmonModelRenderer(this, 90, 45);
      neck_fin.addBox(-8.5F, -10.86667F, -0.3333333F, 18, 18, 1);
      neck_fin.setTextureSize(128, 64);
      neck_fin.mirror = true;
      setRotation(neck_fin, -0.4014257F, 0F, 0F);
      PixelmonModelRenderer  top_fin = new PixelmonModelRenderer(this, 27, 36);
      top_fin.addBox(0F, -12.86667F, -3.8F, 1, 9, 7);
      top_fin.setTextureSize(128, 64);
      top_fin.mirror = true;
      setRotation(top_fin, -0.0349066F, 0F, 0F);
      Head.addChild(neck_fin);
      Head.addChild(top_fin);
      
      
      ModuleHead headModule = new ModuleHead(Head);

		float legspeed = 0.8F;
		float legRotationLimit = 1.1F;

		ModuleLeg frontlegLModule = new ModuleLeg(FLLeg, EnumLeg.FrontLeft,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg frontlegRModule = new ModuleLeg(FRLeg, EnumLeg.FrontRight,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg backlegLModule = new ModuleLeg(BLLeg, EnumLeg.BackLeft,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg backlegRModule = new ModuleLeg(BRLeg, EnumLeg.BackRight,
				EnumPhase.OutPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonQuadruped(Body, headModule, frontlegLModule,
				frontlegRModule, backlegLModule, backlegRModule);
      
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
