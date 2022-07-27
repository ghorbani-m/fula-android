package fx.android.fula;

import mobile.Fula;

public class FulaAPI {
    private final Fula FulaClient;

    public FulaAPI(String repo) {
        FulaClient = new Fula(repo);
    }

    public void addBox(String ma) throws Exception {
        FulaClient.addBox(ma);
    }

    public String encryptSend(String path) throws Exception {
        return FulaClient.encryptSend(path);
    }

    public void receiveDecryptFile(String ref, String path) throws Exception {
        FulaClient.receiveDecryptFile(ref, path);
    }

    public void receiveFile(String ref, String path) throws Exception {
        FulaClient.receiveFile(ref, path);
    }

    public byte[] receiveFileInfo(String ref) throws Exception {
        return FulaClient.receiveFileInfo(ref);
    }

    public String send(String path) throws Exception {
        return FulaClient.send(path);
    }
}
