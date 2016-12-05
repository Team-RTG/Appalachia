
ModelRenderer Squirrel;

public Modelsquirrel()
{
     textureWidth = 64;
     textureHeight = 32;
     setTextureOffset("skull.skull", 0, 26);
     setTextureOffset("head.head.snout", 13, 29);
     setTextureOffset("body.body", 0, 12);
     setTextureOffset("haunch.haunch", 27, 16);
     setTextureOffset("backRightLeg.backRightLeg", 49, 16);
     setTextureOffset("backLeftLeg.backLeftLeg", 49, 16);
     setTextureOffset("Squirrel.frontRightLeg", 49, 21);
     setTextureOffset("Squirrel.frontLeftLeg", 49, 21);
     setTextureOffset("ears.ears.leftEar", 20, 29);
     setTextureOffset("ears.ears.rightEar", 20, 29);
     setTextureOffset("tailPieceBottom.tailPieceBottom", 0, 0);
     setTextureOffset("tailPieceMidBottom.tailPieceMidBottom", 13, 0);
     setTextureOffset("tailPieceMidTop.tailPieceMidTop", 26, 0);
     setTextureOffset("tailPieceTop.tailPieceTop", 37, 0);


     ModelRenderer Squirrel_head = new ModelRenderer(this,"head");
     Squirrel_head.setRotationPoint(0F, 1F, 0.5F);
     setRotation(Squirrel_head, -0.01745329F, 0F, 0F);
     Squirrel_head.addBox("snout", -1F ,-2F ,0F ,2 ,2, 1);
     Squirrel.addChild(Squirrel_head);

     ModelRenderer head_skull = new ModelRenderer(this,"skull");
     head_skull.addBox("skull", -1F, -2F, -3F, 3, 3, 3);
     head_skull.setRotationPoint(0F, 0F, 0F);
     setRotation(head_skull, 0F, 0F, 0F);
     Squirrel_head.addChild(head_skull);

     ModelRenderer Squirrel_body = new ModelRenderer(this,"body");
     Squirrel_body.mirror = true;
     Squirrel_body.addBox("body", -2F, 0F, -9F, 4, 4, 9);
     Squirrel_body.mirror = false;
     Squirrel_body.setRotationPoint(0.5F, -1F, 8.3F);
     setRotation(Squirrel_body, 0.05235988F, 0F, 0F);
     Squirrel.addChild(Squirrel_body);

     ModelRenderer body_haunch = new ModelRenderer(this,"haunch");
     body_haunch.mirror = true;
     body_haunch.addBox("haunch", -2F, -2F, 0F, 5, 4, 5);
     body_haunch.mirror = false;
     body_haunch.setRotationPoint(-0.5F, 1F, -2F);
     setRotation(body_haunch, -0.5183628F, 0F, 0F);
     Squirrel_body.addChild(body_haunch);

     ModelRenderer Squirrel_backRightLeg = new ModelRenderer(this,"backRightLeg");
     Squirrel_backRightLeg.addBox("backRightLeg", -2F, 0F, -3F, 1, 1, 3);
     Squirrel_backRightLeg.setRotationPoint(0.1F, 3.5F, 10F);
     setRotation(Squirrel_backRightLeg, 0F, 0F, 0F);
     Squirrel.addChild(Squirrel_backRightLeg);

     Squirrel = new ModelRenderer(this,"Squirrel");
     Squirrel.setRotationPoint(0F ,19.5F, -4F);
     setRotation(Squirrel, 0F, 0F, 0F);
     Squirrel.addBox("frontRightLeg",0F, 0F, -1F, 1, 3, 1);
     Squirrel.addBox("frontLeftLeg",0F, 0F, -1F, 1, 3, 1);

     ModelRenderer Squirrel_backLeftLeg = new ModelRenderer(this,"backLeftLeg");
     Squirrel_backLeftLeg.addBox("backLeftLeg", 0F, 0F, -3F, 1, 1, 3);
     Squirrel_backLeftLeg.setRotationPoint(1.9F, 3.5F, 10F);
     setRotation(Squirrel_backLeftLeg, 0F, 0F, 0F);
     Squirrel.addChild(Squirrel_backLeftLeg);

     ModelRenderer head_ears = new ModelRenderer(this,"ears");
     head_ears.setRotationPoint(0F, 0F, -0.5F);
     setRotation(head_ears, -0.1361357F, 0F, 0F);
     head_ears.addBox("leftEar", 0F ,-1F ,0F ,0 ,2, 1);
     head_ears.addBox("rightEar", 0F ,-1F ,0F ,0 ,2, 1);
     Squirrel_head.addChild(head_ears);

     ModelRenderer Squirrel_tail = new ModelRenderer(this,"tail");
     Squirrel_tail.setRotationPoint(0.5F, 0.8F, 11.5F);
     setRotation(Squirrel_tail, -0.4642576F, 0F, 0F);
     Squirrel.addChild(Squirrel_tail);

     ModelRenderer tail_tailPieceBottom = new ModelRenderer(this,"tailPieceBottom");
     tail_tailPieceBottom.addBox("tailPieceBottom", -2F, -3F, 0F, 4, 3, 2);
     tail_tailPieceBottom.setRotationPoint(0F, -0.5F, -2F);
     setRotation(tail_tailPieceBottom, -0.8464847F, 0F, 0F);
     Squirrel_tail.addChild(tail_tailPieceBottom);

     ModelRenderer tail_tailPieceMidBottom = new ModelRenderer(this,"tailPieceMidBottom");
     tail_tailPieceMidBottom.addBox("tailPieceMidBottom", -1F, 0F, 0F, 3, 2, 3);
     tail_tailPieceMidBottom.setRotationPoint(-0.5F, -2F, 0F);
     setRotation(tail_tailPieceMidBottom, 1.338668F, 0F, 0F);
     Squirrel_tail.addChild(tail_tailPieceMidBottom);

     ModelRenderer tail_tailPieceMidTop = new ModelRenderer(this,"tailPieceMidTop");
     tail_tailPieceMidTop.addBox("tailPieceMidTop", -2F, -3F, 0F, 2, 3, 3);
     tail_tailPieceMidTop.setRotationPoint(-1.5F, -4.7F, 0.8F);
     setRotation(tail_tailPieceMidTop, 0F, 1.570796F, 0.1099557F);
     Squirrel_tail.addChild(tail_tailPieceMidTop);

     ModelRenderer tail_tailPieceTop = new ModelRenderer(this,"tailPieceTop");
     tail_tailPieceTop.addBox("tailPieceTop", -2F, -3F, 0F, 4, 3, 2);
     tail_tailPieceTop.setRotationPoint(0F, -7F, 2F);
     setRotation(tail_tailPieceTop, 1.010546F, 0F, 0F);
     Squirrel_tail.addChild(tail_tailPieceTop);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
  {
     model.rotateAngleX = x;
     model.rotateAngleY = y;
     model.rotateAngleZ = z;
  }
