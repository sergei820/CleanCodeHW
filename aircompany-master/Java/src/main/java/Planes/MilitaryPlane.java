package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType planeType;

    public MilitaryPlane(String planeModel, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity, MilitaryType planeType) {
        super(planeModel, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
        this.planeType = planeType;
    }

    public MilitaryType getPlaneType() {
        return planeType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + planeType +
                '}');
    }

    @Override
    public boolean equals(Object comparedPlane) {
        if (this == comparedPlane) return true;
        if (comparedPlane instanceof MilitaryPlane) return true;
        if (super.equals(comparedPlane)) return true;
        return planeType == ((MilitaryPlane) comparedPlane).planeType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), planeType);
    }
}
