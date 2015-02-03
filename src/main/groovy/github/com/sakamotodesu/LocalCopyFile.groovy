package github.com.sakamotodesu

/**
 * a file on local server
 */
class LocalCopyFile extends CopyFile {

    File localFile

    /**
     *
     * @return {@inheritDoc}
     */
    @Override
    BufferedInputStream getBufferedInputStream() {
        return new BufferedInputStream(new FileInputStream(localFile))
    }

    /**
     *
     * @return {@inheritDoc}
     */
    @Override
    BufferedOutputStream getBufferedOutputStream() {
        return new BufferedOutputStream(new FileOutputStream(localFile))
    }

    /**
     *
     * @return {@inheritDoc}
     */
    @Override
    def isDirectory() {
        return localFile.isDirectory()
    }
    /**
     *
     * @return {@inheritDoc}
     */

    @Override
    def getPath() {
        return localFile.getAbsolutePath()
    }

    /**
     *
     * @return {@inheritDoc}
     */
    @Override
    def getParent() {
        return new LocalCopyFile(localFile: localFile.getParentFile())
    }

    /**
     *
     * @return {@inheritDoc}
     */
    @Override
    def String getName() {
        return localFile.getName()
    }

    /**
     *
     * @return {@inheritDoc}
     */
    @Override
    def exists() {
        return localFile.exists()
    }
}
