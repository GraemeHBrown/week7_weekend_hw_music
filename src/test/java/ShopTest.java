import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.item.ISell;
import shop.item.Item;
import shop.item.accessories.Accessory;
import shop.item.accessories.AccessoryType;
import shop.item.accessories.Drumstick;
import shop.item.accessories.GuitarString;
import shop.item.instrument.Guitar;
import shop.item.instrument.Instrument;
import shop.item.instrument.InstrumentType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    ISell item;
    ISell item2;
    ISell item3;

    @Before
    public void before() {
        shop = new Shop();
        item2 = new GuitarString("Guitar strings", 6.00, AccessoryType.GUITAR_STRINGS, 6, "9-42");
        item3 = new Drumstick("Drum sticks", 12.00, AccessoryType.DRUMMING_ACCESSORIES, "Hickory", "wood");
        item = new Guitar(600.00, "Guitar", "Black", InstrumentType.STRING, "Martin 000-28", "Mahogany Blocks", "Hardwood", "Chrome tuning machine", 6);
        ((GuitarString) item2).setRetailPrice(8.00);
        ((Guitar) item).setRetailPrice(800.00);

    }

    @Test
    public void newShopHasEmptyStockList() {
        assertNotNull(shop.getStock());
    }

    @Test
    public void shopCanAddItemsToStock() {
        int countBeforeAdd = shop.stockCount();
        shop.addItemToStock(item);
        assertEquals(countBeforeAdd + 1, shop.stockCount());
    }

    @Test
    public void shopCanRemoveItemFromStock() {
        shop.addItemToStock(item);
        int countBeforeRemove = shop.stockCount();
        shop.removeItemFromStock(item);
        assertEquals(countBeforeRemove - 1, shop.stockCount());
    }

    @Test
    public void canCalculateTotalPotentialProfitFromStockList() {
        shop.addItemToStock(item);
        shop.addItemToStock(item2);
        double itemProfit = item.calculateMarkup();
        double item2Profit = item2.calculateMarkup();
        double totalProfit = shop.calculateTotalPotentialProfit();
        assertEquals(itemProfit + item2Profit, totalProfit, 0.00);
    }

    @Test
    public void canGetItemDetailsFromStockList() {
        shop.addItemToStock(item2);
        ArrayList<Item> items = shop.getStockItems();
        assertEquals("Guitar strings", items.get(0).getItemDescription());
    }

    @Test
    public void canGetItemCategoryDetailsFromStockItemWhichIsAnAccessory() {
        shop.addItemToStock(item2);
        ArrayList<Item> items = shop.getStockItems();
        Accessory foundItemType = (Accessory) shop.getItemType(items.get(0));
        assertEquals(AccessoryType.GUITAR_STRINGS, foundItemType.getAccessoryType());
    }

    @Test
    public void canGetItemCategoryDetailsFromStockItemWhichIsAnInstrument() {
        shop.addItemToStock(item);
        ArrayList<Item> items = shop.getStockItems();
        Instrument foundItemType = (Instrument) shop.getItemType(items.get(0));
        assertEquals(InstrumentType.STRING, foundItemType.getType());
    }

    @Test
    public void shopCanSellItem() {
        shop.addItemToStock(item);
        shop.addItemToStock(item2);
        int stockCountBeforeSale = shop.stockCount();
        shop.sellItem(item);
        assertEquals(stockCountBeforeSale - 1, shop.stockCount());
    }

    @Test
    public void sellingAnItemIncreasesSoldItemsSize() {
        shop.addItemToStock(item);
        shop.addItemToStock(item2);
        int soldItemsCountBeforeSale = shop.soldItemsCount();
        shop.sellItem(item);
        assertEquals(soldItemsCountBeforeSale + 1, shop.soldItemsCount());
    }

    @Test
    public void canCalculateActualProfitFromSoldItems() {
        shop.addItemToStock(item);
        shop.addItemToStock(item2);
        shop.sellItem(item);
        double itemActualProfit = item.calculateActualProfit();
        double totalActualProfit = shop.calculateTotalActualProfitFromSoldItems();
        assertEquals(itemActualProfit,totalActualProfit, 0.00);
    }
}