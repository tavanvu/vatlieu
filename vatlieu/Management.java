package vatlieu;

public class Management {
    private Material[] materials = new Material[0];

    public Management() {
    }

    public Management(Material[] materials) {
        this.materials = materials;
    }

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

    public void addNewMaterialToList(Material material) {
        Material[] newMaterials = new Material[materials.length + 1];
        for (int i = 0; i < materials.length; i++) {
            newMaterials[i] = materials[i];
        }
        newMaterials[materials.length] = material;
        materials = newMaterials;
    }

    public void updateMaterialInfo(Material material, int index) {
        materials[index] = material;
    }

    public void deleteMaterial(int index) {
        if (index < 0 || index >= materials.length) {
            System.out.println("Vị trí không hợp lệ");
        } else {
            Material[] newMaterials = new Material[materials.length - 1];
            for (int i = 0; i < newMaterials.length; i++) {
                if (i < index) {
                    newMaterials[i] = materials[i];
                } else {
                    newMaterials[i] = materials[i + 1];
                }
            }
            materials = newMaterials;
        }
    }
}
