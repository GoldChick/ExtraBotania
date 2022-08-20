package chick.extrabotany.common.entities.projectile;

import chick.extrabotany.common.ModEntities;
import chick.extrabotany.forge.client.model.MiscellaneousIcons;
import chick.extrabotany.network.DamageHandler;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import vazkii.botania.client.core.proxy.ClientProxy;
import vazkii.botania.client.fx.WispParticleData;

import java.util.List;

public class EntityTrueTerraBladeProjectile extends EntityProjectileBase
{
    public EntityTrueTerraBladeProjectile(EntityType<? extends ThrowableProjectile> type, Level level)
    {
        super(type, level);
    }

    public EntityTrueTerraBladeProjectile(Level level, LivingEntity thrower, float damageTime)
    {
        super(ModEntities.TRUE_TERRA_BLADE, level, thrower);
        this.damageTime = damageTime;
    }

    @Override
    public void tick()
    {
        super.tick();
        if (level.isClientSide && tickCount % 2 == 0)
        {
            WispParticleData data = WispParticleData.wisp(0.3F, 0.1F, 0.95F, 0.1F, 1F);
            ClientProxy.INSTANCE.addParticleForceNear(level, data, getX(), getY(), getZ(), 0, 0, 0);
        }
        if (!level.isClientSide && tickCount % 3 == 0)
        {
            AABB axis = new AABB(getX(), getY(), getZ(), xOld, yOld, zOld).inflate(2);
            List<LivingEntity> entities = level.getEntitiesOfClass(LivingEntity.class, axis);
            List<LivingEntity> list = DamageHandler.INSTANCE.getFilteredEntities(entities, getOwner());
            for (LivingEntity living : list)
            {
                DamageHandler.INSTANCE.dmg(living, getOwner(), 7F * damageTime, DamageHandler.INSTANCE.MAGIC);
                if (attackedEntities != null && !attackedEntities.contains(living))
                {
                    DamageHandler.INSTANCE.dmg(living, getOwner(), 2F * damageTime, DamageHandler.INSTANCE.LIFE_LOSING);
                    attackedEntities.add(living);
                }
                tickCount += 20;
                if (tickCount > getLifeTicks())
                {
                    discard();
                    break;
                }
            }
        }
    }

    @Override
    public int getLifeTicks()
    {
        return 60;
    }

    @Override
    public BakedModel getIcon()
    {
        return MiscellaneousIcons.INSTANCE.trueterrabladeprojectileModel[0];
    }
}
