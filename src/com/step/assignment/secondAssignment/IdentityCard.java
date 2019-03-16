package com.step.assignment.secondAssignment;

public class IdentityCard implements Duplicable<DuplicateIdentityCard>{
    private String personName;
    private long id;

    public IdentityCard(String personName, long id) {
        this.personName = personName;
        this.id = id;
    }

    @Override
    public DuplicateIdentityCard duplicate() {
        return new DuplicateIdentityCard(this.personName,this.id);
    }
}
