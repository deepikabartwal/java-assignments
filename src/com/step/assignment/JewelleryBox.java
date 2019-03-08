package com.step.assignment;

public class JewelleryBox {
    private JewelleryBox jewelleryBox;
    private Jewellery jewellery;

    public JewelleryBox() {
    }

    public JewelleryBox(JewelleryBox jewelleryBox, Jewellery jewellery) {
        this.jewelleryBox = jewelleryBox;
        this.jewellery = jewellery;
    }

    public JewelleryBox(JewelleryBox jewelleryBox) {
        this.jewelleryBox = jewelleryBox;
    }

    public JewelleryBox(Jewellery jewellery) {
        this.jewellery = jewellery;
    }

    public boolean hasJewellery(){
        return this.jewellery != null;
    }
    public boolean hasJewelleryBox(){
        return this.jewelleryBox != null;
    }

    public int getTotalJewelleryCount(){
        int jewelleryCount = 0;
            if (hasJewellery()) {
                jewelleryCount += 1;
            }
            if(hasJewelleryBox()) {
                jewelleryCount += this.jewelleryBox.getTotalJewelleryCount();
            }
            return jewelleryCount;
        }
}
