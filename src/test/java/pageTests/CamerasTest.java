package pageTests;

import blocks.ProductBlock;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CameraProductsPage;
import pages.MainPage;

public class CamerasTest extends BaseTest{
    MainPage mainPage = new MainPage();
    CameraProductsPage camerasPage = new CameraProductsPage();
    @Test
    public void checkPriseOfCameras(){
        String cannonCamera = "Canon EOS 5D";
        String nikonCamera = "Nikon D300";
        mainPage.clickCameraMenuButton();

        Assertions.assertThat(camerasPage.getAllProduct().size()).isEqualTo(2);

        ProductBlock cannon = camerasPage.findProduct(cannonCamera);
        ProductBlock nikon = camerasPage.findProduct(nikonCamera);

        Assertions.assertThat(cannon.getNewPrice()).isEqualTo(Double.valueOf(98.00));
        Assertions.assertThat(cannon.getOldPrice()).isEqualTo(Double.valueOf(122.00));
        Assertions.assertThat(nikon.getExRatePrice()).isEqualTo(Double.valueOf(80.00));


    }
}
