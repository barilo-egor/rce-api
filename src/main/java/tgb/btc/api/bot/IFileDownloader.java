package tgb.btc.api.bot;

import java.io.File;

public interface IFileDownloader {

    void downloadFile(String imageId, String localPath);

    String saveFile(File file);

    String saveFile(File file, boolean delete);
}
