package Planes;

import java.util.Objects;

abstract public class Plane {
    String planeModel;
    private int planeMaxSpeed;
    private int planeMaxFlightDistance;
    private int planeMaxLoadCapacity;

    public Plane(String planeModel, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity) {
        this.planeModel = planeModel;
        this.planeMaxSpeed = planeMaxSpeed;
        this.planeMaxFlightDistance = planeMaxFlightDistance;
        this.planeMaxLoadCapacity = planeMaxLoadCapacity;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public int getPlaneMaxSpeed() {
        return planeMaxSpeed;
    }

    public int getPlaneMaxFlightDistance() {
        return planeMaxFlightDistance;
    }

    public int getPlaneMaxLoadCapacity() {
        return this.planeMaxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + planeModel + '\'' +
                ", maxSpeed=" + planeMaxSpeed +
                ", maxFlightDistance=" + planeMaxFlightDistance +
                ", maxLoadCapacity=" + planeMaxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object comparedPlane) {
        if (this == comparedPlane) return true;
        if (comparedPlane instanceof Plane) return true;
        return planeMaxSpeed == ((Plane) comparedPlane).planeMaxSpeed &&
                planeMaxFlightDistance == ((Plane) comparedPlane).planeMaxFlightDistance &&
                planeMaxLoadCapacity == ((Plane) comparedPlane).planeMaxLoadCapacity &&
                Objects.equals(planeModel, ((Plane) comparedPlane).planeModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
    }
}
