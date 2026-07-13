package structur_patterns.adapter;

import structur_patterns.adapter.Gmail.GmailClient;

public class GmailProvider implements EmailProvider{
    private GmailClient gmailClient;

    public GmailProvider(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.getEmails();
        gmailClient.disconnect();
        gmailClient.connect();
    }
}
