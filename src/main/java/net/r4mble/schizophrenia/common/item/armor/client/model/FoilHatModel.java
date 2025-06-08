package net.r4mble.schizophrenia.common.item.armor.client.model;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.HumanoidArmorModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.r4mble.schizophrenia.SchizophreniaMod;

public class FoilHatModel extends HumanoidArmorModel<LivingEntity> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            new ResourceLocation(SchizophreniaMod.MODID, "foil_hat_3d"), "main"
    );

    public FoilHatModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 18).addBox(-7.0F, -3.0F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(12, 30).addBox(7.0F, -1.0F, -7.0F, 1.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(21, 41).addBox(8.0F, 1.0F, -6.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(17, 26).addBox(-8.0F, -1.0F, -7.0F, 1.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(16, 41).mirror().addBox(-9.0F, 1.0F, -2.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(4, 35).addBox(-7.0F, -1.0F, 7.0F, 14.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 11).addBox(-3.0F, 0.0F, 8.0F, 10.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 0).addBox(-5.0F, -7.0F, -6.0F, 11.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(24, 28).addBox(-3.0F, -10.0F, -4.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(40, 28).addBox(-1.0F, -13.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(23, 27).mirror().addBox(5.0F, -1.0F, -8.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(24, 26).addBox(6.0F, 2.0F, -8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 27).addBox(-7.0F, 3.0F, -8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 43).mirror().addBox(3.0F, -1.0F, -8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(36, 44).addBox(-7.0F, -1.0F, -8.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 22).addBox(-5.0F, 0.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(31, 41).mirror().addBox(-5.0F, -1.0F, -8.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(31, 30).addBox(0.0F, -16.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 45).addBox(0.0F, -18.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition right_boot = partdefinition.addOrReplaceChild("right_boot", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition left_boot = partdefinition.addOrReplaceChild("left_boot", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}