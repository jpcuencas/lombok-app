// Generated by delombok at Mon Sep 03 20:16:23 CEST 2018
package io.spring.lombok;
/*
Just read the class, added a nice to string method and a Equals and Hashcode method (only one field)
*/
public class LombokExample4 {
    private String ejemplo1;
    private String ejemplo2;
    private String ejemplo3;
    private String ejemplo4;
    private String ejemplo5;
    private Double id;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof LombokExample4)) return false;
        final LombokExample4 other = (LombokExample4) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof LombokExample4;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    @java.lang.SuppressWarnings("all")
    public String getEjemplo1() {
        return this.ejemplo1;
    }

    @java.lang.SuppressWarnings("all")
    public String getEjemplo2() {
        return this.ejemplo2;
    }

    @java.lang.SuppressWarnings("all")
    public String getEjemplo3() {
        return this.ejemplo3;
    }

    @java.lang.SuppressWarnings("all")
    public String getEjemplo4() {
        return this.ejemplo4;
    }

    @java.lang.SuppressWarnings("all")
    public String getEjemplo5() {
        return this.ejemplo5;
    }

    @java.lang.SuppressWarnings("all")
    public Double getId() {
        return this.id;
    }

    @java.lang.SuppressWarnings("all")
    public void setEjemplo1(final String ejemplo1) {
        this.ejemplo1 = ejemplo1;
    }

    @java.lang.SuppressWarnings("all")
    public void setEjemplo2(final String ejemplo2) {
        this.ejemplo2 = ejemplo2;
    }

    @java.lang.SuppressWarnings("all")
    public void setEjemplo3(final String ejemplo3) {
        this.ejemplo3 = ejemplo3;
    }

    @java.lang.SuppressWarnings("all")
    public void setEjemplo4(final String ejemplo4) {
        this.ejemplo4 = ejemplo4;
    }

    @java.lang.SuppressWarnings("all")
    public void setEjemplo5(final String ejemplo5) {
        this.ejemplo5 = ejemplo5;
    }

    @java.lang.SuppressWarnings("all")
    public void setId(final Double id) {
        this.id = id;
    }
}