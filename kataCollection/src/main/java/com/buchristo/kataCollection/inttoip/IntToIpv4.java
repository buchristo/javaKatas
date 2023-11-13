package com.buchristo.kataCollection.inttoip;

import java.util.List;

public class IntToIpv4 {

    /* Take the following IPv4 address: 128.32.10.1

This address has 4 octets where each octet is a single byte (or 8 bits).

1st octet 128 has the binary representation: 10000000
2nd octet 32 has the binary representation: 00100000
3rd octet 10 has the binary representation: 00001010
4th octet 1 has the binary representation: 00000001
So 128.32.10.1 == 10000000.00100000.00001010.00000001

Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361 */

    public String longToIP(long ip) {

        if(ip == 0) {
            return "0.0.0.0";
        }

        String binary = String.format("%32s", Long.toBinaryString(ip)).replace(" ", "0");
        StringBuilder stringBuilder = new StringBuilder(binary);
        stringBuilder.insert(8, ".");
        stringBuilder.insert(17, ".");
        stringBuilder.insert(26, ".");

        List<String> binaryArray = List.of(stringBuilder.toString().split("\\."));

        StringBuilder buildIp = new StringBuilder();

        for (String bin : binaryArray
        ) {
            int foo = Integer.parseInt(bin, 2);
            buildIp.append(foo);
            buildIp.append(".");
        }
        buildIp.deleteCharAt(buildIp.length() - 1);
        return buildIp.toString();
    }
}
