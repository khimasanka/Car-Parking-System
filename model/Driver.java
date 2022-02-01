package model;

import javafx.scene.text.Text;

public class Driver {

    private String name;
    private String nic;
    private String licenceNo;
    private String address;
    private String contact;

    public Driver() {
    }

    public Driver(String name, String nic, String licenceNo, String address, String contact) {
        this.setName(name);
        this.setNic(nic);
        this.setLicenceNo(licenceNo);
        this.setAddress(address);
        this.setContact(contact);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", licenceNo='" + licenceNo + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
