class defanging_an_ip_address {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
