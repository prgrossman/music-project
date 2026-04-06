package com.prgrossman.music.domain.instrument;

import com.prgrossman.music.domain.product.Condition;
import com.prgrossman.music.domain.product.Product;
import com.prgrossman.music.domain.product.ProductType;

public abstract class Instrument extends Product {
    private final String modelName;
    private final Condition condition;

    protected Instrument( int productId, double basePrice, String modelName, Condition condition){
        super(productId, basePrice);
        if(modelName == null || modelName.isBlank()){
            throw new IllegalArgumentException("Model name required.");
        }
        if(condition == null){
            throw new IllegalArgumentException("Condition required");
        }
        this.modelName = modelName;
        this.condition = condition;

    }

    public String getModelName() {
        return modelName;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public ProductType getProductType(){
        return ProductType.INSTRUMENT;
    }

    public abstract InstrumentType getInstrumentType();

}
