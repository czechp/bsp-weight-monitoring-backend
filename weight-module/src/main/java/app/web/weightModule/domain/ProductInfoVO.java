package app.web.weightModule.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class ProductInfoVO {
    private final float upRangeWeight;
    private final float downRangeWeight;

    ProductInfoVO() {
        this.upRangeWeight = 0f;
        this.downRangeWeight = 0f;
    }


}
