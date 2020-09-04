/* 
 * Copyright 2013-2018 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package org.modelio.gproject.module.catalog;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.module.IMetamodelFragmentHandle;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.vbasic.version.Version;
import org.modelio.vbasic.version.VersionedItem;

/**
 * Module handle generated by {@link FileModuleAdditionStore}.
 * <p>
 * This handle is {@link Comparable comparable} with a <code>String</code> or a <code>FileCatalogModuleHandle</code>.
 */
@objid ("2c9748eb-f37d-11e1-a3c7-002564c97630")
public class FileModuleStoreHandle implements IModuleHandle, Comparable<Object> {
    @objid ("6949ebe8-f37d-11e1-a3c7-002564c97630")
    private final String name;

    @objid ("6949ebee-f37d-11e1-a3c7-002564c97630")
    private final String uid;

    @objid ("6949ebf3-f37d-11e1-a3c7-002564c97630")
    private final String mainClassName;

    @objid ("2c9748ee-f37d-11e1-a3c7-002564c97630")
    private final Version version;

    @objid ("2c9748f2-f37d-11e1-a3c7-002564c97630")
    private final Version binaryVersion;

    @objid ("2c9748f3-f37d-11e1-a3c7-002564c97630")
    private final List<VersionedItem<?>> dependencies;

    @objid ("2c9748f6-f37d-11e1-a3c7-002564c97630")
    private final List<VersionedItem<?>> weakDependencies;

    @objid ("87d0d26c-54be-4f44-ab34-445b958d6edd")
    private final Path moduleCachePath;

    @objid ("afc4f3e1-1013-4515-a60c-6c2c6c97af8e")
    private final List<Path> docPaths;

    @objid ("644259c1-1d90-466c-9984-b49819fb608b")
    private final List<Path> jarPaths;

    @objid ("ed00681d-baa6-4572-a81e-f474faadda7f")
    private final Map<String, Path> stylePaths;

    @objid ("a24100b6-581b-45e3-9eec-abd5628708d1")
    private final List<IMetamodelFragmentHandle> metamodelFragments;

    /**
     * Public constructor.
     * <p>
     * This object takes ownership of all passed collections.
     * @param moduleCachePath the module cache path
     * @param name the module name
     * @param version the moduel version
     * @param uid UUID identifier of the module model element
     * @param mainClassName the main class name
     * @param binaryVersion the needed Modelio version
     * @param dependencies the needed modules
     * @param weakDependencies the optionally used modules
     * @param docPaths the documentation jar paths
     * @param jarPaths the jar paths
     * @param stylePaths the diagrams styles path
     * @param metamodelFragments the provided metamodel fragments
     */
    @objid ("2c9748ff-f37d-11e1-a3c7-002564c97630")
    FileModuleStoreHandle(Path moduleCachePath, String name, Version version, String uid, String mainClassName, Version binaryVersion, List<VersionedItem<?>> dependencies, List<VersionedItem<?>> weakDependencies, List<Path> docPaths, List<Path> jarPaths, Map<String, Path> stylePaths, List<IMetamodelFragmentHandle> metamodelFragments) {
        this.moduleCachePath = moduleCachePath;
        this.name = name;
        this.version = version;
        this.uid = uid;
        this.mainClassName = mainClassName;
        
        this.binaryVersion = binaryVersion;
        this.dependencies = dependencies;
        this.weakDependencies = weakDependencies;
        this.docPaths = docPaths;
        this.jarPaths = jarPaths;
        this.stylePaths = stylePaths;
        this.metamodelFragments = metamodelFragments;
    }

    @objid ("2c974914-f37d-11e1-a3c7-002564c97630")
    @Override
    public String getName() {
        return this.name;
    }

    @objid ("2c98cf80-f37d-11e1-a3c7-002564c97630")
    @Override
    public Version getVersion() {
        return this.version;
    }

    @objid ("2c98cf85-f37d-11e1-a3c7-002564c97630")
    @Override
    public Path getModuleInfosPath() {
        return this.moduleCachePath.resolve("moduleInfos.xml");
    }

    @objid ("2c98cf8a-f37d-11e1-a3c7-002564c97630")
    @Override
    public Path getModelComponentPath() {
        return this.moduleCachePath.resolve("staticModel.ramc");
    }

    @objid ("2c98cf8f-f37d-11e1-a3c7-002564c97630")
    @Override
    public Path getDynamicModelPath() {
        return this.moduleCachePath.resolve("dynamicModel.xml");
    }

    @objid ("2c98cf94-f37d-11e1-a3c7-002564c97630")
    @Override
    public Path getResourcePath() {
        return this.moduleCachePath;
    }

    @objid ("2c98cf99-f37d-11e1-a3c7-002564c97630")
    @Override
    public List<Path> getJarPaths() {
        return this.jarPaths;
    }

    @objid ("2c98cfa0-f37d-11e1-a3c7-002564c97630")
    @Override
    public List<Path> getDocPaths() {
        return this.docPaths;
    }

    @objid ("2c98cfa7-f37d-11e1-a3c7-002564c97630")
    @Override
    public String getUid() {
        return this.uid;
    }

    @objid ("2c98cfac-f37d-11e1-a3c7-002564c97630")
    @Override
    public String getMainClassName() {
        return this.mainClassName;
    }

    @objid ("2c98cfb6-f37d-11e1-a3c7-002564c97630")
    @Override
    public Version getBinaryVersion() {
        return this.binaryVersion;
    }

    @objid ("2c9a561e-f37d-11e1-a3c7-002564c97630")
    @Override
    public List<VersionedItem<?>> getDependencies() {
        return this.dependencies;
    }

    @objid ("2c9a5625-f37d-11e1-a3c7-002564c97630")
    @Override
    public List<VersionedItem<?>> getWeakDependencies() {
        return this.weakDependencies;
    }

    @objid ("d95db795-37da-11e2-8ba4-002564c97630")
    @Override
    public Path getArchive() {
        int buildVersion = this.version.getBuildVersion();
        String archiveName = this.name + "_" + this.version.getMajorVersion() + "." + this.version.getMinorVersion() + "." + (buildVersion < 10 ? "0" + buildVersion : buildVersion) + ".jmdac";
        return this.moduleCachePath.getParent().resolve(archiveName);
    }

    /**
     * Get the root path where all module files are extracted or created.
     * <p>
     * This directory can be copied then a new handle can be created on the directory copy.
     * @return the module root path.
     */
    @objid ("44c6c46d-615b-470e-bead-2176e0d438fb")
    public Path getModuleCachePath() {
        return this.moduleCachePath;
    }

    @objid ("5bd6b81b-362f-4711-acb2-7c49c078a8c1")
    @Override
    public String toString() {
        return getClass().getSimpleName()+"("+getName()+" v"+getVersion()+" @"+getModuleCachePath()+")";
    }

    @objid ("78e65118-bf63-4eb4-8796-c9393fa858b8")
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof String){
            return this.name.toString().compareTo((String)obj);
        
        } else if (obj instanceof FileModuleStoreHandle){
            return this.version.toString().compareTo(((FileModuleStoreHandle)obj).version.toString());
        }
        return 0;
    }

    @objid ("293c3919-1a3f-44de-9e6c-29bd6cc4e62c")
    @Override
    public Map<String, Path> getStylePaths() {
        return this.stylePaths ;
    }

    @objid ("686a7ba0-ccfd-4188-92be-b89c4e02b522")
    @Override
    public List<IMetamodelFragmentHandle> getMetamodelFragments() {
        return this.metamodelFragments;
    }

    @objid ("f8541359-b015-4f3a-b63c-f21d4cc88460")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((this.moduleCachePath == null) ? 0 : this.moduleCachePath
                        .hashCode());
        result = prime * result
                + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result
                + ((this.version == null) ? 0 : this.version.hashCode());
        return result;
    }

    @objid ("f2bbd6d8-fb38-4ac9-b9ab-04196b0848ae")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FileModuleStoreHandle other = (FileModuleStoreHandle) obj;
        if (this.moduleCachePath == null) {
            if (other.moduleCachePath != null) {
                return false;
            }
        } else if (!this.moduleCachePath.equals(other.moduleCachePath)) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.version == null) {
            if (other.version != null) {
                return false;
            }
        } else if (!this.version.equals(other.version)) {
            return false;
        }
        return true;
    }

}
