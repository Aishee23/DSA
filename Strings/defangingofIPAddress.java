class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
