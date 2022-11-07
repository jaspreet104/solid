package com.example.solidexample.lspbad;

// Liskov substitution Principle
// derived classes should be completely substitutable for their base class

public interface BadSocialMedia {
    public void chatWithFriends();
    public void publishPost(Object post);
    public void sendPhotosAndVids();
    public void groupVideoCall(String... users);
}
