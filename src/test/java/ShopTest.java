import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.item.ISell;
import shop.item.instrument.Guitar;
import shop.item.instrument.InstrumentType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    ISell item;

    @Before
    public void before(){
        shop = new Shop();
        item = new Guitar(600.00,"Guitar","Black", InstrumentType.STRING, "Martin 000-28", "Mahogany Blocks", "Hardwood", "Chrome tuning machine", 6);
    }

    @Test
    public void newShopHasEmptyStockList(){
        assertNotNull(shop.getStock());
    }

    @Test
    public void shopCanAddItemsToStock(){
        int countBeforeAdd = shop.stockCount();
        shop.addItemToStock(item);
        assertEquals(countBeforeAdd+1, shop.stockCount());
    }

    @Test
    public void shopCanRemoveItemFromStock(){
        shop.addItemToStock(item);
        int countBeforeRemove = shop.stockCount();
        shop.removeItemFromStock(item);
        assertEquals(countBeforeRemove-1, shop.stockCount());
    }
}
