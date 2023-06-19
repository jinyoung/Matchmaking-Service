<template>

    <v-card outlined>
        <v-card-title>
            CreateUserProfile
        </v-card-title>

        <v-card-text>
            <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="FirstName" v-model="value.firstName" :editMode="editMode"/>
            <String label="LastName" v-model="value.lastName" :editMode="editMode"/>
            <Number label="Age" v-model="value.age" :editMode="editMode"/>
            <String label="Gender" v-model="value.gender" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createUserProfile"
            >
                CreateUserProfile
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
        name: 'CreateUserProfileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.userId = 0;
            this.value.firstName = '';
            this.value.lastName = '';
            this.value.age = 0;
            this.value.gender = '';
        },
        watch: {
        },
        methods: {
            createUserProfile() {
                this.$emit('createUserProfile', this.value);
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

