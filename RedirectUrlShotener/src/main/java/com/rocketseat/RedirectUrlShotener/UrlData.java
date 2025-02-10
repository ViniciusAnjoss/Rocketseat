package com.rocketseat.RedirectUrlShotener;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class UrlData {
    private String originalURL;
    private  long expirationTime;

}
