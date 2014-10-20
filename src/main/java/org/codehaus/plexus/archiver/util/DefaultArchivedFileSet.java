package org.codehaus.plexus.archiver.util;

import java.io.File;

import javax.annotation.Nonnull;

import org.codehaus.plexus.archiver.ArchivedFileSet;


/**
 * Default implementation of {@link ArchivedFileSet}.
 * @since 1.0-alpha-9
 */
public class DefaultArchivedFileSet
    extends AbstractFileSet<DefaultArchivedFileSet>
    implements ArchivedFileSet
{
    private File archive;

	public DefaultArchivedFileSet(@Nonnull File archive) {
		this.archive = archive;
	}


    public DefaultArchivedFileSet() {
    }

    /**
     * Sets the file sets archive.
     */
    public void setArchive( File archive )
    {
        this.archive = archive;
    }

    public File getArchive()
    {
        return archive;
    }

	public static DefaultArchivedFileSet archivedFileSet( File archiveFile ){
        if (archiveFile == null)
        {
            throw new IllegalArgumentException( "Archive File cannot be null" );
        }
        return new DefaultArchivedFileSet(archiveFile);
	}
}
