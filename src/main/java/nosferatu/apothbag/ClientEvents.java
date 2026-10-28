package nosferatu.apothbag;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = ApothTalismanBag.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> ItemProperties.register(ApothTalismanBag.TALISMAN_BAG.get(),
                ResourceLocation.fromNamespaceAndPath(ApothTalismanBag.MODID, "charm_count"),
                (stack, level, entity, seed) -> TalismanBagItem.getVisibleCharmCount(stack)));
    }
}
