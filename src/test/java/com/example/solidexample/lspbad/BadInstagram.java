package com.example.solidexample.lspbad;

// not substitutable with SocialMedia class since one operation is not supported
public class BadInstagram {
    public void chatWithFriends() {}
    public void publishPost(Object post) {}
    public void sendPhotosAndVids() {}
    public void groupVideoCall(String... users) {
        // not supported
    }
}
