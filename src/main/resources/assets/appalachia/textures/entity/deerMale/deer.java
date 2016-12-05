
ModelRenderer deerMale;

public ModeldeerMale()
{
     textureWidth = 256;
     textureHeight = 64;
     setTextureOffset("head.head.skull", 50, 0);
     setTextureOffset("head.head.snout", 25, 0);
     setTextureOffset("earRight.earRight", 40, 0);
     setTextureOffset("earLeft.earLeft", 40, 0);
     setTextureOffset("aLSeg1.aLSeg1", 0, 0);
     setTextureOffset("aLSeg2.aLSeg2", 0, 0);
     setTextureOffset("aLSeg3.aLSeg3", 0, 0);
     setTextureOffset("aLSeg4.aLSeg4", 0, 0);
     setTextureOffset("aLSeg5.aLSeg5", 0, 0);
     setTextureOffset("aLSeg6.aLSeg6", 0, 0);
     setTextureOffset("aRSeg1.aRSeg1", 0, 0);
     setTextureOffset("aRSeg2.aRSeg2", 0, 0);
     setTextureOffset("aRSeg3.aRSeg3", 0, 0);
     setTextureOffset("aRSeg4.aRSeg4", 0, 0);
     setTextureOffset("aRSeg5.aRSeg5", 0, 0);
     setTextureOffset("aRSeg6.aRSeg6", 0, 0);
     setTextureOffset("neckTop.neckTop", 0, 16);
     setTextureOffset("neck.neck.neckBottom", 31, 18);
     setTextureOffset("chest.chest", 41, 29);
     setTextureOffset("frontShoulders.frontShoulders", 0, 42);
     setTextureOffset("haunch.haunch", 77, 10);
     setTextureOffset("tail.tail", 61, 16);
     setTextureOffset("legBackRight.legBackRight.legTopR", 136, 46);
     setTextureOffset("legMiddleR.legMiddleR", 119, 45);
     setTextureOffset("legBottomR.legBottomR", 107, 46);
     setTextureOffset("legBackRight.legBackRight.footRB", 92, 36);
     setTextureOffset("legTopL.legTopL", 136, 46);
     setTextureOffset("legMiddleL.legMiddleL", 119, 45);
     setTextureOffset("legBottomL.legBottomL", 107, 46);
     setTextureOffset("legBackLeft.legBackLeft.footLB", 92, 36);
     setTextureOffset("legTopRF.legTopRF", 140, 32);
     setTextureOffset("legMiddleBottomRF.legMiddleBottomRF", 128, 33);
     setTextureOffset("legFrontRight.legFrontRight.legBottom", 117, 34);
     setTextureOffset("legFrontRight.legFrontRight.footRF", 92, 36);
     setTextureOffset("legTopLF.legTopLF", 140, 32);
     setTextureOffset("legMiddleBottomLF.legMiddleBottomLF", 128, 33);
     setTextureOffset("legBottomFL.legBottomFL", 117, 34);
     setTextureOffset("legFrontLeft.legFrontLeft.footLF", 92, 36);


     deerMale = new ModelRenderer(this,"deerMale");
     deerMale.setRotationPoint(0F ,7F, -9F);
     setRotation(deerMale, 0F, 0F, 0F);

     ModelRenderer neckTop_head = new ModelRenderer(this,"head");
     neckTop_head.setRotationPoint(0.5F, -3F, -7F);
     setRotation(neckTop_head, 0.7906342F, 0F, 0F);
     neckTop_head.addBox("skull", -3F ,-6F ,-6F ,6 ,6, 6);
     neckTop_head.addBox("snout", 0F ,0F ,0F ,3 ,3, 4);
     neck_neckTop.addChild(neckTop_head);

     ModelRenderer head_ears = new ModelRenderer(this,"ears");
     head_ears.setRotationPoint(0F, -6F, -3F);
     setRotation(head_ears, 0F, 0F, 0F);
     neckTop_head.addChild(head_ears);

     ModelRenderer ears_earRight = new ModelRenderer(this,"earRight");
     ears_earRight.addBox("earRight", -1F, -4F, 0F, 3, 4, 1);
     ears_earRight.setRotationPoint(1F, 1F, 0F);
     setRotation(ears_earRight, 0F, 0F, 0.3839724F);
     head_ears.addChild(ears_earRight);

     ModelRenderer ears_earLeft = new ModelRenderer(this,"earLeft");
     ears_earLeft.addBox("earLeft", -1F, -4F, 0F, 3, 4, 1);
     ears_earLeft.setRotationPoint(-2F, 1.4F, 0F);
     setRotation(ears_earLeft, 0F, 0F, -0.3839724F);
     head_ears.addChild(ears_earLeft);

     ModelRenderer head_antlers = new ModelRenderer(this,"antlers");
     head_antlers.setRotationPoint(0F, 0F, -1.5F);
     setRotation(head_antlers, 0F, 0F, 0F);
     neckTop_head.addChild(head_antlers);

     ModelRenderer antlers_antlerLeft = new ModelRenderer(this,"antlerLeft");
     antlers_antlerLeft.setRotationPoint(2F, -6F, 0F);
     setRotation(antlers_antlerLeft, 0F, 0F, 0F);
     head_antlers.addChild(antlers_antlerLeft);

     ModelRenderer antlerLeft_aLSeg1 = new ModelRenderer(this,"aLSeg1");
     antlerLeft_aLSeg1.addBox("aLSeg1", 0F, -2F, 0F, 1, 2, 1);
     antlerLeft_aLSeg1.setRotationPoint(0F, 0F, -0.1F);
     setRotation(antlerLeft_aLSeg1, 0F, 0F, 0.546288F);
     antlers_antlerLeft.addChild(antlerLeft_aLSeg1);

     ModelRenderer antlerLeft_aLSeg2 = new ModelRenderer(this,"aLSeg2");
     antlerLeft_aLSeg2.addBox("aLSeg2", 0F, 0F, 0F, 6, 1, 1);
     antlerLeft_aLSeg2.setRotationPoint(0.8F, -1.7F, 0F);
     setRotation(antlerLeft_aLSeg2, 0F, 0.4363323F, -0.3822271F);
     antlers_antlerLeft.addChild(antlerLeft_aLSeg2);

     ModelRenderer antlerLeft_aLSeg3 = new ModelRenderer(this,"aLSeg3");
     antlerLeft_aLSeg3.addBox("aLSeg3", 0F, 0F, 0F, 2, 1, 1);
     antlerLeft_aLSeg3.setRotationPoint(5.5F, -3.7F, -2F);
     setRotation(antlerLeft_aLSeg3, 0.4101524F, 0.9564404F, -0.1361357F);
     antlers_antlerLeft.addChild(antlerLeft_aLSeg3);

     ModelRenderer antlerLeft_aLSeg4 = new ModelRenderer(this,"aLSeg4");
     antlerLeft_aLSeg4.addBox("aLSeg4", 0F, -3F, 0F, 1, 3, 1);
     antlerLeft_aLSeg4.setRotationPoint(6F, -3.5F, -3F);
     setRotation(antlerLeft_aLSeg4, 0.6562437F, 0.6283185F, 0F);
     antlers_antlerLeft.addChild(antlerLeft_aLSeg4);

     ModelRenderer antlerLeft_aLSeg5 = new ModelRenderer(this,"aLSeg5");
     antlerLeft_aLSeg5.addBox("aLSeg5", 0F, -2F, 0F, 1, 5, 1);
     antlerLeft_aLSeg5.setRotationPoint(1F, -4.2F, -1F);
     setRotation(antlerLeft_aLSeg5, 0.2181662F, 0F, 0F);
     antlers_antlerLeft.addChild(antlerLeft_aLSeg5);

     ModelRenderer antlerLeft_aLSeg6 = new ModelRenderer(this,"aLSeg6");
     antlerLeft_aLSeg6.addBox("aLSeg6", 0F, -3F, 0F, 1, 3, 1);
     antlerLeft_aLSeg6.setRotationPoint(3F, -2F, -1F);
     setRotation(antlerLeft_aLSeg6, 0.2460914F, 0.3281219F, 0F);
     antlers_antlerLeft.addChild(antlerLeft_aLSeg6);

     ModelRenderer antlers_antlerRight = new ModelRenderer(this,"antlerRight");
     antlers_antlerRight.setRotationPoint(-2F, -6F, 0.7F);
     setRotation(antlers_antlerRight, 0F, 3.141593F, 0F);
     head_antlers.addChild(antlers_antlerRight);

     ModelRenderer antlerRight_aRSeg1 = new ModelRenderer(this,"aRSeg1");
     antlerRight_aRSeg1.addBox("aRSeg1", 0F, -2F, 0F, 1, 2, 1);
     antlerRight_aRSeg1.setRotationPoint(0F, 0F, -0.1F);
     setRotation(antlerRight_aRSeg1, 0F, 0F, 0.546288F);
     antlers_antlerRight.addChild(antlerRight_aRSeg1);

     ModelRenderer antlerRight_aRSeg2 = new ModelRenderer(this,"aRSeg2");
     antlerRight_aRSeg2.addBox("aRSeg2", 0F, 0F, 0F, 6, 1, 1);
     antlerRight_aRSeg2.setRotationPoint(0.8F, -1.7F, -0.3F);
     setRotation(antlerRight_aRSeg2, 0F, -0.4363323F, -0.3822271F);
     antlers_antlerRight.addChild(antlerRight_aRSeg2);

     ModelRenderer antlerRight_aRSeg3 = new ModelRenderer(this,"aRSeg3");
     antlerRight_aRSeg3.addBox("aRSeg3", 0F, 0F, 0F, 2, 1, 1);
     antlerRight_aRSeg3.setRotationPoint(5.5F, -4F, 2F);
     setRotation(antlerRight_aRSeg3, -0.4101524F, -0.9564404F, -0.1361357F);
     antlers_antlerRight.addChild(antlerRight_aRSeg3);

     ModelRenderer antlerRight_aRSeg4 = new ModelRenderer(this,"aRSeg4");
     antlerRight_aRSeg4.addBox("aRSeg4", 0F, -3F, 0F, 1, 3, 1);
     antlerRight_aRSeg4.setRotationPoint(6.2F, -3.5F, 2.7F);
     setRotation(antlerRight_aRSeg4, -0.6544985F, -0.6283185F, 0F);
     antlers_antlerRight.addChild(antlerRight_aRSeg4);

     ModelRenderer antlerRight_aRSeg5 = new ModelRenderer(this,"aRSeg5");
     antlerRight_aRSeg5.addBox("aRSeg5", 0F, -2F, 0F, 1, 5, 1);
     antlerRight_aRSeg5.setRotationPoint(1F, -4.2F, 0.4F);
     setRotation(antlerRight_aRSeg5, -0.2181662F, 0F, 0F);
     antlers_antlerRight.addChild(antlerRight_aRSeg5);

     ModelRenderer antlerRight_aRSeg6 = new ModelRenderer(this,"aRSeg6");
     antlerRight_aRSeg6.addBox("aRSeg6", 0F, -3F, 0F, 1, 3, 1);
     antlerRight_aRSeg6.setRotationPoint(3F, -2.5F, 0.8F);
     setRotation(antlerRight_aRSeg6, -0.2583087F, -0.3281219F, 0F);
     antlers_antlerRight.addChild(antlerRight_aRSeg6);

     ModelRenderer deerMale_neck = new ModelRenderer(this,"neck");
     deerMale_neck.setRotationPoint(0F, 0F, 0F);
     setRotation(deerMale_neck, 0F, 0F, 0F);
     deerMale_neck.addBox("neckBottom", -3F ,-6F ,0F ,6 ,6, 7);
     deerMale.addChild(deerMale_neck);

     ModelRenderer neck_neckTop = new ModelRenderer(this,"neckTop");
     neck_neckTop.addBox("neckTop", -2F, -5F, -10F, 5, 5, 10);
     neck_neckTop.setRotationPoint(-0.5F, 3F, -4F);
     setRotation(neck_neckTop, -0.7906342F, 0F, 0F);
     deerMale_neck.addChild(neck_neckTop);

     ModelRenderer deerMale_body = new ModelRenderer(this,"body");
     deerMale_body.setRotationPoint(0F, 0F, 0F);
     setRotation(deerMale_body, 0F, 0F, 0F);
     deerMale.addChild(deerMale_body);

     ModelRenderer body_chest = new ModelRenderer(this,"chest");
     body_chest.addBox("chest", -5F, 0F, 0F, 10, 11, 18);
     body_chest.setRotationPoint(0F, -4F, 0F);
     setRotation(body_chest, 0.0541052F, 0F, 0F);
     deerMale_body.addChild(body_chest);

     ModelRenderer body_frontShoulders = new ModelRenderer(this,"frontShoulders");
     body_frontShoulders.addBox("frontShoulders", -5.5F, 0F, 0F, 11, 10, 6);
     body_frontShoulders.setRotationPoint(0F, -4F, -1F);
     setRotation(body_frontShoulders, -0.1361357F, 0F, 0F);
     deerMale_body.addChild(body_frontShoulders);

     ModelRenderer body_haunch = new ModelRenderer(this,"haunch");
     body_haunch.addBox("haunch", -4F, -5F, 0F, 8, 10, 9);
     body_haunch.setRotationPoint(0F, 0F, 16F);
     setRotation(body_haunch, -0.2740167F, 0F, 0F);
     deerMale_body.addChild(body_haunch);

     ModelRenderer haunch_tail = new ModelRenderer(this,"tail");
     haunch_tail.addBox("tail", -1.5F, 0F, 0F, 3, 5, 2);
     haunch_tail.setRotationPoint(0F, -3F, 7.7F);
     setRotation(haunch_tail, 0.7923795F, 0F, 0F);
     body_haunch.addChild(haunch_tail);

     ModelRenderer deerMale_legBackRight = new ModelRenderer(this,"legBackRight");
     deerMale_legBackRight.setRotationPoint(-5.1F, 0F, 20F);
     setRotation(deerMale_legBackRight, 0F, 0F, 0F);
     deerMale_legBackRight.addBox("legTopR", 0F ,-2F ,-4F ,2 ,7, 8);
     deerMale_legBackRight.addBox("footRB", -2F ,0F ,-5F ,3 ,1, 5);
     deerMale.addChild(deerMale_legBackRight);

     ModelRenderer legBackRight_legMiddleR = new ModelRenderer(this,"legMiddleR");
     legBackRight_legMiddleR.addBox("legMiddleR", 0F, 0F, 0F, 2, 5, 5);
     legBackRight_legMiddleR.setRotationPoint(0F, 5F, -2F);
     setRotation(legBackRight_legMiddleR, 0F, 0F, 0F);
     deerMale_legBackRight.addChild(legBackRight_legMiddleR);

     ModelRenderer legBackRight_legBottomR = new ModelRenderer(this,"legBottomR");
     legBackRight_legBottomR.addBox("legBottomR", 0F, 0F, 0F, 2, 8, 3);
     legBackRight_legBottomR.setRotationPoint(0.1F, 9F, -1F);
     setRotation(legBackRight_legBottomR, -0.2740167F, 0F, 0F);
     deerMale_legBackRight.addChild(legBackRight_legBottomR);

     ModelRenderer deerMale_legBackLeft = new ModelRenderer(this,"legBackLeft");
     deerMale_legBackLeft.setRotationPoint(3.1F, 0F, 20F);
     setRotation(deerMale_legBackLeft, 0F, 0F, 0F);
     deerMale_legBackLeft.addBox("footLB", -2F ,0F ,-5F ,3 ,1, 5);
     deerMale.addChild(deerMale_legBackLeft);

     ModelRenderer legBackLeft_legTopL = new ModelRenderer(this,"legTopL");
     legBackLeft_legTopL.mirror = true;
     legBackLeft_legTopL.addBox("legTopL", 0F, -2F, -4F, 2, 7, 8);
     legBackLeft_legTopL.mirror = false;
     legBackLeft_legTopL.setRotationPoint(0F, 0F, 0F);
     setRotation(legBackLeft_legTopL, 0F, 0F, 0F);
     deerMale_legBackLeft.addChild(legBackLeft_legTopL);

     ModelRenderer legBackLeft_legMiddleL = new ModelRenderer(this,"legMiddleL");
     legBackLeft_legMiddleL.mirror = true;
     legBackLeft_legMiddleL.addBox("legMiddleL", 0F, 0F, 0F, 2, 5, 5);
     legBackLeft_legMiddleL.mirror = false;
     legBackLeft_legMiddleL.setRotationPoint(0F, 5F, -2F);
     setRotation(legBackLeft_legMiddleL, 0F, 0F, 0F);
     deerMale_legBackLeft.addChild(legBackLeft_legMiddleL);

     ModelRenderer legBackLeft_legBottomL = new ModelRenderer(this,"legBottomL");
     legBackLeft_legBottomL.mirror = true;
     legBackLeft_legBottomL.addBox("legBottomL", 0F, 0F, 0F, 2, 8, 3);
     legBackLeft_legBottomL.mirror = false;
     legBackLeft_legBottomL.setRotationPoint(0.1F, 9F, -1F);
     setRotation(legBackLeft_legBottomL, -0.2740167F, 0F, 0F);
     deerMale_legBackLeft.addChild(legBackLeft_legBottomL);

     ModelRenderer deerMale_legFrontRight = new ModelRenderer(this,"legFrontRight");
     deerMale_legFrontRight.setRotationPoint(-4.3F, 1F, 0F);
     setRotation(deerMale_legFrontRight, 0F, 0F, 0F);
     deerMale_legFrontRight.addBox("legBottom", 0F ,-1F ,0F ,2 ,6, 2);
     deerMale_legFrontRight.addBox("footRF", 0F ,-1F ,-3F ,3 ,1, 4);
     deerMale.addChild(deerMale_legFrontRight);

     ModelRenderer legFrontRight_legTopRF = new ModelRenderer(this,"legTopRF");
     legFrontRight_legTopRF.addBox("legTopRF", 0F, -1.5F, 0F, 2, 6, 4);
     legFrontRight_legTopRF.setRotationPoint(-1.5F, 0F, 0F);
     setRotation(legFrontRight_legTopRF, -0.1640609F, 0F, 0F);
     deerMale_legFrontRight.addChild(legFrontRight_legTopRF);

     ModelRenderer legFrontRight_legMiddleBottomRF = new ModelRenderer(this,"legMiddleBottomRF");
     legFrontRight_legMiddleBottomRF.addBox("legMiddleBottomRF", 0F, 0F, 0F, 2, 7, 2);
     legFrontRight_legMiddleBottomRF.setRotationPoint(-1.8F, 4F, 0F);
     setRotation(legFrontRight_legMiddleBottomRF, -0.3281219F, 0F, 0F);
     deerMale_legFrontRight.addChild(legFrontRight_legMiddleBottomRF);

     ModelRenderer deerMale_legFrontLeft = new ModelRenderer(this,"legFrontLeft");
     deerMale_legFrontLeft.setRotationPoint(5.1F, 1F, 0F);
     setRotation(deerMale_legFrontLeft, 0F, 0F, 0F);
     deerMale_legFrontLeft.addBox("footLF", 0F ,-1F ,-3F ,3 ,1, 4);
     deerMale.addChild(deerMale_legFrontLeft);

     ModelRenderer legFrontLeft_legTopLF = new ModelRenderer(this,"legTopLF");
     legFrontLeft_legTopLF.mirror = true;
     legFrontLeft_legTopLF.addBox("legTopLF", 0F, -1.5F, 0F, 2, 6, 4);
     legFrontLeft_legTopLF.mirror = false;
     legFrontLeft_legTopLF.setRotationPoint(-1.5F, 0F, 0F);
     setRotation(legFrontLeft_legTopLF, -0.1640609F, 0F, 0F);
     deerMale_legFrontLeft.addChild(legFrontLeft_legTopLF);

     ModelRenderer legFrontLeft_legMiddleBottomLF = new ModelRenderer(this,"legMiddleBottomLF");
     legFrontLeft_legMiddleBottomLF.mirror = true;
     legFrontLeft_legMiddleBottomLF.addBox("legMiddleBottomLF", -1F, 0F, 0F, 2, 7, 2);
     legFrontLeft_legMiddleBottomLF.mirror = false;
     legFrontLeft_legMiddleBottomLF.setRotationPoint(-0.3F, 4F, 0F);
     setRotation(legFrontLeft_legMiddleBottomLF, -0.3001966F, 0F, 0F);
     deerMale_legFrontLeft.addChild(legFrontLeft_legMiddleBottomLF);

     ModelRenderer legFrontLeft_legBottomFL = new ModelRenderer(this,"legBottomFL");
     legFrontLeft_legBottomFL.mirror = true;
     legFrontLeft_legBottomFL.addBox("legBottomFL", 0F, 0F, 0F, 2, 6, 2);
     legFrontLeft_legBottomFL.mirror = false;
     legFrontLeft_legBottomFL.setRotationPoint(-1.4F, 10F, -2F);
     setRotation(legFrontLeft_legBottomFL, 0.1640609F, 0F, 0F);
     deerMale_legFrontLeft.addChild(legFrontLeft_legBottomFL);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
  {
     model.rotateAngleX = x;
     model.rotateAngleY = y;
     model.rotateAngleZ = z;
  }
