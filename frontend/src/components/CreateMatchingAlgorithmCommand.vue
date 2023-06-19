<template>

    <v-card outlined>
        <v-card-title>
            CreateMatchingAlgorithm
        </v-card-title>

        <v-card-text>
            <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
            <Number label="AgePreferenceMin" v-model="value.agePreferenceMin" :editMode="editMode"/>
            <Number label="AgePreferenceMax" v-model="value.agePreferenceMax" :editMode="editMode"/>
            <String label="GenderPreference" v-model="value.genderPreference" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createMatchingAlgorithm"
            >
                CreateMatchingAlgorithm
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateMatchingAlgorithmCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.userId = 0;
            this.value.agePreferenceMin = 0;
            this.value.agePreferenceMax = 0;
            this.value.genderPreference = '';
        },
        watch: {
        },
        methods: {
            createMatchingAlgorithm() {
                this.$emit('createMatchingAlgorithm', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

